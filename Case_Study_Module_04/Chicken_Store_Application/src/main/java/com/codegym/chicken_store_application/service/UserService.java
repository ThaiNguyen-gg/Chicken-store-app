package com.codegym.chicken_store_application.service;

import com.codegym.chicken_store_application.dto.RoleDto;
import com.codegym.chicken_store_application.dto.UserDto;
import com.codegym.chicken_store_application.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService extends GeneralService<UserDto> {
    Optional<UserDto> findByUsername(String username);
    Iterable<UserDto> findByActivatedAndRole(Boolean isActivated, RoleDto roleDto);
    void updatePassword(UserDto userDto);

    void updateNewPassword(UserDto userDto);
    void updateRole(UserDto userDto);
    void updateAllData(UserDto userDto);
    Iterable<UserDto> findByFullNameContainingAndActivated(String fullname, Boolean isActivated);
    Optional<UserDto> createAndGetUser(UserDto userDto);

}
