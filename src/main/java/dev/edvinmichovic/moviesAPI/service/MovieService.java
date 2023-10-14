package dev.edvinmichovic.moviesAPI.service;

import dev.edvinmichovic.moviesAPI.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MovieService {
     List<Movie> getAllMovies();
     Optional<Movie> getSingleMovie(String imdbId);
}
