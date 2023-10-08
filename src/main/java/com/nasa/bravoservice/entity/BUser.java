package com.nasa.bravoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class BUser implements Serializable {
    @Id
    Long id;
    private String name;
    private String email;
    private String password_hash;
    private boolean isactive;
    private Timestamp joined;
    private Long createdBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
