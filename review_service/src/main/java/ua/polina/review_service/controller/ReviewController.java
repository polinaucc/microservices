package ua.polina.review_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.service.ReviewService;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/save")
    public Review saveReview(@RequestBody ReviewDto dto){
        return reviewService.save(dto);
    }
}
