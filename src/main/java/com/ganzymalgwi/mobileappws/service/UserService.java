package com.ganzymalgwi.mobileappws.service;

import com.ganzymalgwi.mobileappws.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
