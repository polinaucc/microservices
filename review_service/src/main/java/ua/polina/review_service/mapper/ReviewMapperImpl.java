package ua.polina.review_service.mapper;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.service.MovieService;
import ua.polina.review_service.service.UserService;

@Component
@RequiredArgsConstructor
public class ReviewMapperImpl implements ReviewMapper {
    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;

    @Override
    public Review reviewDtoToReview(ReviewDto dto) {
        if(dto == null) return null;

        Review review = new Review();
        review.setComment(dto.getComment());
        review.setRating(dto.getRating());
        review.setMovie(movieService.findById(dto.getMovieId()));
        review.setUser(userService.findById(dto.getUserId()));

        return review;
    }
}
