package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {


    private ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
//
//    @GetMapping("/count")
//    public int getCategoryCount() {
//        return 5; // Example count, replace with actual logic
//    }

}
