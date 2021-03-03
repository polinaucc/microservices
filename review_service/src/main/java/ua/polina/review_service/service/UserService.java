package ua.polina.review_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.polina.review_service.entity.User;

@FeignClient("user")
public interface UserService {
    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}
