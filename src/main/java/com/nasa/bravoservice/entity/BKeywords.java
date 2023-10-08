package com.nasa.bravoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BKeywords {
    private Long id;
    private String name;
    private Long user_id;
    private Timestamp created_at;

    private Timestamp updated_at;
}
