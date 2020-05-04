package com.example.demo.dto;


import lombok.Data;

import java.util.List;
@Data
public class UserDto {
    private long id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private List<CommentDto> comments;
}
