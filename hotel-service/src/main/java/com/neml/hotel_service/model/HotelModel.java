package com.neml.hotel_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hotel_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelModel {

    @Id
    @Column(name = "hotel_id")
    private String hotelId;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "location")
    private String location;
}
