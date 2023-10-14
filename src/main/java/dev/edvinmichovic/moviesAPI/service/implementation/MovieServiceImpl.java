package dev.edvinmichovic.moviesAPI.service.implementation;

import dev.edvinmichovic.moviesAPI.model.Movie;
import dev.edvinmichovic.moviesAPI.repository.MovieRepository;
import dev.edvinmichovic.moviesAPI.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
