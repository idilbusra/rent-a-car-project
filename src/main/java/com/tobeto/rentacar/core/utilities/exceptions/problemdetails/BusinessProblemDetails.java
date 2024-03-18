package com.tobeto.rentacar.core.utilities.exceptions.problemdetails;

public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails(){
        setTitle("Business Rule Validation");
        setType("http://mydomain.com/exceptions/business");
        setStatus("400");
    }
}
