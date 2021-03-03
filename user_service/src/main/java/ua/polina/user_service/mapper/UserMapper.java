package ua.polina.user_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ua.polina.user_service.dto.UserDto;
import ua.polina.user_service.entity.User;
import ua.polina.user_service.service.UserServiceImpl;

@Mapper
public interface UserMapper {

    User userDtoToUser(UserDto userDto);
}
