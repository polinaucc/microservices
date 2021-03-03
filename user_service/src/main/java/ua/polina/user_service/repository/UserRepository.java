package ua.polina.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.polina.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
