package com.khan.homework50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Post {
    private String photo;
    private String description;
    private LocalDateTime postDateTime;
}
