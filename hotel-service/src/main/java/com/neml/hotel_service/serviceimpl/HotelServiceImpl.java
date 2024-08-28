package com.neml.hotel_service.serviceimpl;

import com.neml.hotel_service.exceptions.ResourceNotFoundException;
import com.neml.hotel_service.model.HotelModel;
import com.neml.hotel_service.model.HotelResponse;
import com.neml.hotel_service.respository.HotelRepository;
import com.neml.hotel_service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public HotelResponse addHotel(HotelModel hotelModel) {

        HotelResponse response = new HotelResponse();
        String randomHotelId= UUID.randomUUID().toString();
        hotelModel.setHotelId(randomHotelId);
        Optional<HotelModel> optional = Optional.of(hotelRepository.save(hotelModel));
        if(optional.isPresent()){
            response.setErrorCode("200");
            response.setMessage("Hotel has stored successfully");
            return response;
        } else {
            response.setErrorCode("201");
            response.setMessage("Hotel has not stored successfully");
            return response;
        }
    }

    @Override
    public HotelModel getHotelByHotelId(String hotelId) {

        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("HotelId is not found on server !!!"));
    }

    @Override
    public List<HotelModel> getAllHotel() {
        List<HotelModel> hotelModels = new ArrayList<>();
        return  hotelModels = hotelRepository.findAll();
    }
}
