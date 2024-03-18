package com.tobeto.rentacar.core.utilities.exceptions.problemdetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemDetails {
    //rfec standarts
    private String title;
    private String detail;
    private String status;
    private String type;
}
