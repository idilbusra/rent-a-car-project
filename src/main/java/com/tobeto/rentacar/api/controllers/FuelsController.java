package com.tobeto.rentacar.api.controllers;

import com.tobeto.rentacar.business.abstracts.FuelService;
import com.tobeto.rentacar.business.dtos.requests.CreateFuelRequest;
import com.tobeto.rentacar.business.dtos.responses.CreatedFuelResponse;
import com.tobeto.rentacar.business.dtos.responses.GetAllFuelResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/fuels")
public class FuelsController {
    private FuelService fuelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedFuelResponse add(@Valid @RequestBody CreateFuelRequest createFuelRequest) {
        return fuelService.add(createFuelRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllFuelResponse> getAll() {
        return fuelService.getAll();
    }
}
