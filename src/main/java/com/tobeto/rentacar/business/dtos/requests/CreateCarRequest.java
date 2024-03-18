package com.tobeto.rentacar.business.dtos.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCarRequest {
    @NotNull
    @Min(value=1950)
    @Max(value=2024)
    private int modelYear;
    private String plate;
    private int state;
    private double dailyPrice;
}
