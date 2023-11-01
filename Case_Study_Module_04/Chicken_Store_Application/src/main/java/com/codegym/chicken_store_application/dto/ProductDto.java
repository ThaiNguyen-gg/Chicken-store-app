package com.codegym.chicken_store_application.dto;

import com.codegym.chicken_store_application.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;

    private String name;

    private Category category;

    private String description;

    private String avatar;

    private Double price;

    private Integer quantity;

    private boolean activated;

    private MultipartFile path;

}
