package com.codegym.chicken_store_application.repository;

import com.codegym.chicken_store_application.entity.Role;
import com.codegym.chicken_store_application.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
