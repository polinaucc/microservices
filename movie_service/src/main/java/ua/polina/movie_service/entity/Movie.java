package ua.polina.movie_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "movie", uniqueConstraints =
@UniqueConstraint(columnNames = {"title", "director_name"}))
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "director_name")
    private String directorName;

    @Column(name = "release_date")
    private LocalDate releaseDate;
}
