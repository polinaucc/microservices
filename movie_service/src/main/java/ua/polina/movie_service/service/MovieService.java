package ua.polina.movie_service.service;

import ua.polina.movie_service.dto.MovieDto;
import ua.polina.movie_service.entity.Movie;

public interface MovieService {
    Movie createMovie(MovieDto movieDto);

    Movie getById(Long id);
}
