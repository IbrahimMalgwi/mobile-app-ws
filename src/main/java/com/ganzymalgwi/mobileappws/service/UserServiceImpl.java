package com.ganzymalgwi.mobileappws.service;

import com.ganzymalgwi.mobileappws.dto.UserDto;
import com.ganzymalgwi.mobileappws.model.enitity.UserEntity;
import com.ganzymalgwi.mobileappws.repository.UserRepository;
import com.ganzymalgwi.mobileappws.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    Utils utils;

    @Override
    public UserDto createUser(UserDto user) {

        if(userRepository.findByEmail(user.getEmail()) != null)
            throw new RuntimeException("Record already exists");

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        String publicUserId = utils.generateUserId(30);
        userEntity.setEncryptedPassword("testUserId");
        userEntity.setUserId(publicUserId);

        UserEntity storedUserValue = userRepository.save(userEntity);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserValue, returnValue);
        return returnValue;
    }
}
