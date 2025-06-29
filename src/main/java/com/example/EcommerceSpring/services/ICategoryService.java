package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    // Define methods that the service should implement
    List<CategoryDTO> getAllCategories() throws IOException;
//    int getCategoryCount();
}
