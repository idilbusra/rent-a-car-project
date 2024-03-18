package com.tobeto.rentacar.business.dtos.responses;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatedCarResponse {
    @Size
    private int modelYear;
    private String plate;
    private int state;
    private double dailyPrice;
}
