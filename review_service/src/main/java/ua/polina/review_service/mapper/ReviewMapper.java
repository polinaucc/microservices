package ua.polina.review_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.service.MovieService;
import ua.polina.review_service.service.UserService;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    Review reviewDtoToReview(ReviewDto dto);
}
