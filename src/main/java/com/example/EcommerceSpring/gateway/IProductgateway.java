package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.Productdto;

public interface IProductgateway {
    Productdto getProductById(Long id) throws Exception;
}
