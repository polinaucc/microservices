package ua.polina.user_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.polina.user_service.dto.UserDto;
import ua.polina.user_service.entity.User;
import ua.polina.user_service.mapper.UserMapper;
import ua.polina.user_service.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Override
    public User saveUser(UserDto dto) {
        return userRepository.save(mapper.userDtoToUser(dto));
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No user with such id"));
    }
}
