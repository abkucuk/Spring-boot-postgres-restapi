package com.example.demo.dto;
import lombok.Data;

import java.util.List;
@Data
public class ProductDto {
    private Long id;
    private String name;
    private int price;
    private String imageName;
    private String description;
    private List<CommentDto> comments;
}
