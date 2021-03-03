package ua.polina.review_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.polina.review_service.dto.AllReviewsDto;
import ua.polina.review_service.dto.MovieDto;
import ua.polina.review_service.dto.ReviewDto;
import ua.polina.review_service.entity.Movie;
import ua.polina.review_service.entity.Review;
import ua.polina.review_service.entity.User;
import ua.polina.review_service.mapper.ReviewMapper;
import ua.polina.review_service.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository repository;
    private final ReviewMapper mapper;
    private final UserService userService;
    private final MovieService movieService;

    @Override
    public Review save(ReviewDto dto) {
        return repository.save(mapper.reviewDtoToReview(dto));
    }

    //TODO: investigate if it is possible to use mapstruct mapper
    @Override
    public AllReviewsDto getAllByUserId(Long userId) {
        User user = userService.findById(userId);

        AllReviewsDto result = new AllReviewsDto();
        result.setEmail(user.getEmail());
        result.setFirstName(user.getFirstName());
        result.setLastName(user.getLastName());
        result.setMovies(new ArrayList<>());

        List<Review> reviewsByUser = repository.findByUserId(userId);
        reviewsByUser.forEach(r -> {
                    Movie movie = movieService.findById(r.getMovieId());
                    result.getMovies().add(
                            new MovieDto(movie.getTitle(), movie.getDirectorName(), movie.getReleaseDate(), r.getRating(), r.getComment()));
                }
        );

        return result;
    }
}
