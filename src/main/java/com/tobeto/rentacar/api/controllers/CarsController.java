package com.tobeto.rentacar.api.controllers;

import com.tobeto.rentacar.business.abstracts.CarService;
import com.tobeto.rentacar.business.dtos.requests.CreateCarRequest;
import com.tobeto.rentacar.business.dtos.responses.CreatedCarResponse;
import com.tobeto.rentacar.business.dtos.responses.GetAllCarResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/cars")
public class CarsController {
    private CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCarResponse add(@Valid @RequestBody CreateCarRequest createCarRequest) {
        return carService.add(createCarRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllCarResponse> getAll() {
        return carService.getAll();
    }
}
