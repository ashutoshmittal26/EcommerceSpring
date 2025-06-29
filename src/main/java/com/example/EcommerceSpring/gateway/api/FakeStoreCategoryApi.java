package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreCategoryresponsedto;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
@Component
public interface FakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryresponsedto> getAllCategories()  throws IOException;


}
