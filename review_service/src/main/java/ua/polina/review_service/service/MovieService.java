package ua.polina.review_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.polina.review_service.entity.Movie;

@FeignClient("movie")
public interface MovieService {
    @GetMapping("/movies/{id}")
    Movie findById(@PathVariable("id") Long id);
}
