package ua.polina.movie_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.polina.movie_service.dto.MovieDto;
import ua.polina.movie_service.entity.Movie;
import ua.polina.movie_service.service.MovieService;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping("/save")
    public Movie createMovie(@RequestBody MovieDto movieDto) {
        return movieService.createMovie(movieDto);
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable("id") Long id) {
        return movieService.getById(id);
    }
}
