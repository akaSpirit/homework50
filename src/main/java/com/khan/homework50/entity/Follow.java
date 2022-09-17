package com.khan.homework50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Follow {
    private User follower;
    private User subscribe;
    private LocalDateTime followDateTime;
}
