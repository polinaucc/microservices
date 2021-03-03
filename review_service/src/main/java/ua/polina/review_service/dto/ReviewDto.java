package ua.polina.review_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private Long userId;
    private Long movieId;
    private Integer rating;
    private String comment;
}
