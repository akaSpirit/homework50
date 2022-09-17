package com.khan.homework50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Like {
    private User user;
    private Post post;
    private LocalDateTime likeDateTime;
}
