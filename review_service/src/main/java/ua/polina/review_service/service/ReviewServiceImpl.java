package ua.polina.review_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.mapper.ReviewMapper;
import ua.polina.review_service.repository.ReviewRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository repository;
    private final ReviewMapper mapper;

    @Override
    public Review save(ReviewDto dto) {
        return repository.save(mapper.reviewDtoToReview(dto));
    }

    @Override
    public List<Review> getAllByUserId() {
        return null;
    }
}
