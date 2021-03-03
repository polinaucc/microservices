package ua.polina.movie_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.polina.movie_service.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
