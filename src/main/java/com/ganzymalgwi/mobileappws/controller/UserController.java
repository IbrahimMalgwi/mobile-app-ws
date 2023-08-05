package com.ganzymalgwi.mobileappws.controller;

import com.ganzymalgwi.mobileappws.model.request.UserRequest;
import com.ganzymalgwi.mobileappws.model.response.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        UserResponse userResponse = new UserResponse();
        userResponse.setFirstName(userRequest.getFirstName());
        userResponse.setLastName(userRequest.getLastName());
        userResponse.setEmail(userRequest.getEmail());
        userResponse.setUserId("testId");

        return userResponse;
    }
}
