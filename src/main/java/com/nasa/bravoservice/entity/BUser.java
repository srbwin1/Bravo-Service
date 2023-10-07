package com.nasa.bravoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
    private String password;
    private byte[] picture;
    private Date joined;
    private boolean isActive;

    private List<FieldOfScience> language;
}
