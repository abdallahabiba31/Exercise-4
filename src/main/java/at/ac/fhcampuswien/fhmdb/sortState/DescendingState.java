package at.ac.fhcampuswien.fhmdb.sortState;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;
import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Comparator;

public class DescendingState extends MovieState{
    public DescendingState(MovieListController currentStateData) {
        super(currentStateData);
    }
    @Override
    public void sort() {
        currentStateData.observableMovies.sort(Comparator.comparing(Movie::getTitle));
        currentStateData.setState(new AscendingState(currentStateData));

    }
}
