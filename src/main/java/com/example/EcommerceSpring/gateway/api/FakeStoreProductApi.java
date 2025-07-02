package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.ProductResponsedto;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;
@Component
public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<ProductResponsedto> getProductById(@Path("id") Long id)  throws IOException;
}
