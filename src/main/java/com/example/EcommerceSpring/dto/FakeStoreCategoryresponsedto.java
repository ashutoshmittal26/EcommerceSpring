package com.example.EcommerceSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class FakeStoreCategoryresponsedto {
    private String status;
    private String message;
    private List<String> categories;

}
