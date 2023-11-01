package com.codegym.chicken_store_application.repository;

import com.codegym.chicken_store_application.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Iterable<Category> findByActivated(Boolean isActivated);
}
