package com.example.ratingdata.resources;

import com.example.ratingdata.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResources {

   @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId,4);
    }

    @RequestMapping("/users/{userId}")
    public List<Rating> getUserRating(@PathVariable("userId") String userId)
    {
        List<Rating> ratings = Arrays.asList(new Rating("1234",4),
                new Rating("322332",4)
        );
        return ratings;
    }
}
