package com.example.demo.dto;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    private String Description;
    private UserDto user;
}
