package com.neml.rating_service.controller;

import com.neml.rating_service.model.RatingModel;
import com.neml.rating_service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {


    @Autowired
    RatingService ratingService;


    @PostMapping("/add")
    public ResponseEntity<RatingModel> createRating(@RequestBody RatingModel ratingModel){

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.addRating(ratingModel));

    }

    @GetMapping("/")
    public ResponseEntity<List<RatingModel>> getAllRatings(){

        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());

    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<RatingModel>> getRatingOfUsers(@PathVariable String userId){

        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));

    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingModel>> getRatingOfHotels(@PathVariable String hotelId){

        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));

    }
}
