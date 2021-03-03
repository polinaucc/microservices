package ua.polina.review_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.polina.review_service.dto.AllReviewsDto;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/save")
    public Review saveReview(@RequestBody ReviewDto dto){
        return reviewService.save(dto);
    }

    @GetMapping("/{id}")
    public AllReviewsDto getAllByUserId(@PathVariable("id") Long id){
        return reviewService.getAllByUserId(id);
    }
}
