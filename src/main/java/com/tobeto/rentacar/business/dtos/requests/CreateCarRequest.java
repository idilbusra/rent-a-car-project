package com.tobeto.rentacar.business.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCarRequest {
    private int modelYear;
    private String plate;
    private int state;
    private double dailyPrice;
}
