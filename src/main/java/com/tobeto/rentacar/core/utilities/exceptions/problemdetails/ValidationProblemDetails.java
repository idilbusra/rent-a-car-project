package com.tobeto.rentacar.core.utilities.exceptions.problemdetails;

import lombok.Data;
import java.util.Map;

@Data
public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails(){
        setTitle("Validation Rule Validation");
        setDetail("Validation Problem");
        setType( "http://mydomain.com/exceptions/validation" ) ;
        setStatus( "400" ) ;
    }

    private Map<String , String> errors ;
}
