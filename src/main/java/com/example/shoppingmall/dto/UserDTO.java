package com.example.shoppingmall.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
    private String email;
    private String name;
    private Integer age;
    private String password;
}
