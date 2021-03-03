package ua.polina.movie_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private String title;
    private String directorName;
    private LocalDate releaseDate;
}
