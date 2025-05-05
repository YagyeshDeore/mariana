package com.yadnya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yadnya.response.ApiResponse;

@RestController
public class HomeController {
            
        @GetMapping("/Home")
        public ApiResponse HomeControllerHandler() {
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setMessage("Welcome to Yadnya E-commerce API"); // Set the message in the ApiResponse object
            // You can add more data to the ApiResponse object if needed    
            return apiResponse;
        }
}