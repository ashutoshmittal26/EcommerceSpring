package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.dto.FakeStoreCategoryresponsedto;
import com.example.EcommerceSpring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements CategoryGateway{
    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryresponsedto response = this.fakeStoreCategoryApi.getAllCategories().execute().body();
        if (response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");

        }
        return response.getCategories().stream()
                .map(category ->  CategoryDTO.builder()
                        .name(category)
                        .build()).toList();
    }
}
