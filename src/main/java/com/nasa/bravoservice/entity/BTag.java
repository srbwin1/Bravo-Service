package com.nasa.bravoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
public class BTag implements Serializable {

    @Id
    Long id;
    private String name;

    Timestamp createdAt;

    Timestamp updatedAt;

}
