package com.neml.hotel_service.service;

import com.neml.hotel_service.model.HotelModel;
import com.neml.hotel_service.model.HotelResponse;

import java.util.List;

public interface HotelService {

    public HotelResponse addHotel(HotelModel hotelModel);

    public HotelModel getHotelByHotelId(String hotelId);

    public List<HotelModel> getAllHotel();
}
