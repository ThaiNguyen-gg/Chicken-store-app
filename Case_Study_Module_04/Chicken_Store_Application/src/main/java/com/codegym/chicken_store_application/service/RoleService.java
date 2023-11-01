package com.codegym.chicken_store_application.service;

import com.codegym.chicken_store_application.dto.RoleDto;
import com.codegym.chicken_store_application.entity.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService extends GeneralService<RoleDto> {
    Optional<RoleDto> findByName(RoleName name);
    Iterable<String> getDescriptionAlLRole();
}
