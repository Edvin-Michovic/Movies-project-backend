package dev.edvinmichovic.moviesAPI.service;

import dev.edvinmichovic.moviesAPI.model.Review;

public interface ReviewService {
    Review createReview(String reviewBody, String imdbId);
}
