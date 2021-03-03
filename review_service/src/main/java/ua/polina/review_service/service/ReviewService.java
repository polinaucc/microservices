package ua.polina.review_service.service;

import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;

import java.util.List;

public interface ReviewService {
    Review save(ReviewDto dto);

    List<Review> getAllByUserId();
}
