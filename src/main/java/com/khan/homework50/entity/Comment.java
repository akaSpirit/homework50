package com.khan.homework50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Comment {
    private String text;
    private LocalDateTime commentDateTime;
}
