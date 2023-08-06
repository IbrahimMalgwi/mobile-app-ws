package com.ganzymalgwi.mobileappws.controller;

import com.ganzymalgwi.mobileappws.dto.UserDto;
import com.ganzymalgwi.mobileappws.model.request.UserRequest;
import com.ganzymalgwi.mobileappws.model.response.UserResponse;
import com.ganzymalgwi.mobileappws.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        UserResponse userResponse = new UserResponse();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRequest, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, userResponse);

        return userResponse;
    }
}
