package com.lucky.userservice.service;

import com.lucky.userservice.dto.UserDto;
import com.lucky.userservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
