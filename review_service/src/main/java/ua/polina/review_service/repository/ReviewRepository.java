package ua.polina.review_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.polina.review_service.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
