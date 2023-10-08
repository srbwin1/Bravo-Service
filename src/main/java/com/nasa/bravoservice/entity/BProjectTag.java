package com.nasa.bravoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BProjectTag {
    @Id
    private Long id;
    private Long tag_id;
    private Long project_id;
    private String name;
    private Long created_by;
    private Date created_at;
    private Date updated_at;
}
