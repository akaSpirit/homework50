package com.khan.homework50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private String nickname;
    private String email;
    private String password;
    private Integer posts;
    private Integer followers;
    private Integer following;
}
