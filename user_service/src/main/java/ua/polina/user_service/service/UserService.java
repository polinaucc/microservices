package ua.polina.user_service.service;

import ua.polina.user_service.dto.UserDto;
import ua.polina.user_service.entity.User;

public interface UserService {
    User saveUser(UserDto dto);

    User getById(Long id);
}
