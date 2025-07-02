package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.Productdto;

public interface IProductService {

    Productdto getProductById(Long id) throws Exception;

}
