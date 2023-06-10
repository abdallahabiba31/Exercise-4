package at.ac.fhcampuswien.fhmdb.sortState;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public abstract class MovieState {
    protected MovieListController currentStateData;

    public MovieState(MovieListController currentStateData) {
        this.currentStateData = currentStateData;

    }
    public abstract void sort();
}
