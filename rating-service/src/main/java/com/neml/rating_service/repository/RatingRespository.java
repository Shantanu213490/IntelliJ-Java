package com.neml.rating_service.repository;

import com.neml.rating_service.model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRespository extends JpaRepository<RatingModel,String> {

    public List<RatingModel> findByUserId(String userId);
    public List<RatingModel> findByHotelId(String userId);
}
