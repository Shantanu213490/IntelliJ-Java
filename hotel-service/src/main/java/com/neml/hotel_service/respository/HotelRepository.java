package com.neml.hotel_service.respository;

import com.neml.hotel_service.model.HotelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelModel,String> {
}
