package ua.polina.review_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.entity.User;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByUserId(Long userId);
}
