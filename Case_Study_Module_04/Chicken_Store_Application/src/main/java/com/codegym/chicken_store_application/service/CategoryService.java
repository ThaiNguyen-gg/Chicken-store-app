package com.codegym.chicken_store_application.service;

import com.codegym.chicken_store_application.dto.CategoryDto;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService extends GeneralService<CategoryDto>{
    Iterable<String> getNameAlLCategory();
}

