package at.ac.fhcampuswien.fhmdb.sortState;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;
import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Comparator;

public class AscendingState extends MovieState{

    public AscendingState(MovieListController currentStateData) {
        super(currentStateData);
    }
    @Override
    public void sort() {
        currentStateData.observableMovies.sort(Comparator.comparing(Movie::getTitle).reversed());
        currentStateData.setState(new DescendingState(currentStateData));
        /*
        context.observableMovies.sort(Comparator.comparing(Movie::getTitle).reversed());
        context.setState(new DescendingState(context));*/
    }


}

