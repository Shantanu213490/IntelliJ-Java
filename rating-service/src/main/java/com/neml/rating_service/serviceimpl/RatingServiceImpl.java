package com.neml.rating_service.serviceimpl;

import com.neml.rating_service.model.RatingModel;
import com.neml.rating_service.repository.RatingRespository;
import com.neml.rating_service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRespository ratingRespository;


    @Override
    public RatingModel addRating(RatingModel ratingModel) {
        String randomRating = UUID.randomUUID().toString();
        ratingModel.setRatingId(randomRating);
        return ratingRespository.save(ratingModel);
    }

    @Override
    public List<RatingModel> getAllRating() {
        return ratingRespository.findAll();
    }

    @Override
    public List<RatingModel> getRatingByUserId(String userId) {
        return ratingRespository.findByUserId(userId);
    }

    @Override
    public List<RatingModel> getRatingByHotelId(String hotelId) {
        return ratingRespository.findByHotelId(hotelId);
    }
}
