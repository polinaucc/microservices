package ua.polina.review_service.dto;

import liquibase.pro.packaged.A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllReviewsDto {
    private String email;
    private String firstName;
    private String lastName;
    private List<MovieDto> movies;
}
