package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.Productdto;
import com.example.EcommerceSpring.gateway.IProductgateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class FakeStoreProductService implements IProductService{

    private final IProductgateway productgateway;

    public FakeStoreProductService(IProductgateway categoryGateway) {
        this.productgateway = categoryGateway;
    }

    @Override
    public Productdto getProductById(Long id) throws Exception {
        // Implement the logic to fetch product by ID
        // This is a placeholder implementation
        return  this.productgateway.getProductById(id);
    }
}
