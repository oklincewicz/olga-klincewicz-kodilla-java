package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class MoviesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.streamOnMoviesMap();
    }
}
