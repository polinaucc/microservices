package ua.polina.movie_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.polina.movie_service.dto.MovieDto;
import ua.polina.movie_service.entity.Movie;
import ua.polina.movie_service.mapper.MovieMapper;
import ua.polina.movie_service.repository.MovieRepository;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository repository;
    private final MovieMapper movieMapper;

    @Override
    public Movie createMovie(MovieDto movieDto) {
        return repository.save(movieMapper.movieDtoToMovie(movieDto));
    }

    @Override
    public Movie getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No movie with such id"));
    }
}
