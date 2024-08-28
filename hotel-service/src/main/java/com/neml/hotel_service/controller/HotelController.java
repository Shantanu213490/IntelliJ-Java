package com.neml.hotel_service.controller;

import com.neml.hotel_service.model.HotelModel;
import com.neml.hotel_service.model.HotelResponse;
import com.neml.hotel_service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/add")
    public ResponseEntity<HotelResponse> createHotel(@RequestBody HotelModel hotelModel) {

        HotelResponse response = hotelService.addHotel(hotelModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelModel> getHotel(@PathVariable String hotelId) {

        HotelModel hotelModel = hotelService.getHotelByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotelModel);

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<HotelModel>> getAllHotels() {

        List<HotelModel> hotelModels = hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(hotelModels);

    }
}
