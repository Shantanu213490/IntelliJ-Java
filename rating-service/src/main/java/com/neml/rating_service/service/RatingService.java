package com.neml.rating_service.service;

import com.neml.rating_service.model.RatingModel;

import java.util.List;

public interface RatingService {

    public RatingModel addRating(RatingModel ratingModel);
    public List<RatingModel> getAllRating();
    public List<RatingModel> getRatingByUserId(String userId);
    public List<RatingModel> getRatingByHotelId(String hotelId);
}
