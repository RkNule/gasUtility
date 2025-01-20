package com.example.gasuutility.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/service-requests")
public class ServiceRequestController {

    @Operation(summary = "Submit a new service request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Request successfully submitted"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Server error")
    })
    @PostMapping
    public String submitServiceRequest() {
        return "Request submitted!";
    }
}
