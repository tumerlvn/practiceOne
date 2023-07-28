package com.example.practiceOne.entities.booking;

import com.example.practiceOne.entities.additions.SeatClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO extends BookingForm {
    private Long customerId;
    private Long flightId;
    private Integer seatNumber;
    private Integer baggageAmount;
    private SeatClass seatClass;
    private Float cost;

    public void evaluate(Float distance) {
        this.cost = this.baggageAmount * 5 + distance * 10 + this.seatClass.ordinal() * 19800;
    }
}
