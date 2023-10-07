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
public class BProject implements Serializable {

    @Id
    private Long id;
    private String name;
    private String url_on_catalog;
    private String url_external;
    private String description;
    private String keywords;
    private String fields_of_science;
    private Boolean isActive;
    private String agency_sponsor;
    private String agency_sponsor_other;
    private String gov_contact;
    private String gov_contact_email;
    private String geographic_scope;
    private String participant_age;
    private String participation_tasks;
    private Boolean scistarter;
    private String email;
    private Timestamp start_date;
    private String project_goals;
    private Timestamp created_at;
    private Timestamp updated_at;
    
}
