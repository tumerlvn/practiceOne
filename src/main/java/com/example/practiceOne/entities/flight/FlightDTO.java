package com.example.practiceOne.entities.flight;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class FlightDTO {
    private Long id;
    private String aircraftCode;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
}
