package ua.polina.movie_service.mapper;

import ua.polina.movie_service.dto.MovieDto;
import ua.polina.movie_service.entity.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    Movie movieDtoToMovie(MovieDto dto);
}
