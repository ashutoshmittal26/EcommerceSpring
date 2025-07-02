package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.ProductResponsedto;
import com.example.EcommerceSpring.dto.Productdto;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class FakeStoreProductgateway implements IProductgateway{

    private final FakeStoreProductApi fakeStoreProductApi ;

    public FakeStoreProductgateway(FakeStoreProductApi fakeStoreProductAi) {
        this.fakeStoreProductApi = fakeStoreProductAi;
    }
    @Override
    public Productdto getProductById(Long id) throws Exception {

            ProductResponsedto productResponse = this.fakeStoreProductApi.getProductById(id).execute().body();
            if (productResponse == null) {
                throw new IOException("Failed to fetch product from FakeStore API");
            }
            else {
                return productResponse.getProduct();

            }
    }

}