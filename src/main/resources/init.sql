CREATE DATABASE bravo;

    use bravo;

    CREATE TABLE bravo.B_USER(
        id INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL,
        password_hash VARCHAR(30) NOT NULL,
        isActive BOOLEAN NOT NULL DEFAULT FALSE,
        created_by INT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id));

    CREATE TABLE bravo.B_KEYWORDS(
        id INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        user_id INT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        PRIMARY KEY (id),
        FOREIGN KEY (user_id) REFERENCES B_USER(id),
        INDEX (user_id)
    );

    CREATE TABLE bravo.B_PROJECT_USER(
        id int NOT NULL AUTO_INCREMENT,
        project_id INT NOT NULL,
        user_id INT NOT NULL,
        isActive BOOLEAN DEFAULT 0,
        PRIMARY KEY (id),
        FOREIGN KEY (user_id) REFERENCES B_USER(id)
        INDEX(project_id)
    );

  CREATE TABLE bravo.B_TAG(
       id INT NOT NULL AUTO_INCREMENT,
       name VARCHAR(255) NOT NULL,
       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
       PRIMARY KEY (id)
      );

   CREATE TABLE bravo.B_PROJECT_TAG(
        id INT NOT NULL AUTO_INCREMENT,
        tag_id INT NOT NULL,
        project_id INT NOT NULL,
        name VARCHAR(255) NOT NULL,
        created_by INT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        PRIMARY KEY (id),
        FOREIGN KEY (tag_id) REFERENCES B_TAG(id),
        FOREIGN KEY (project_id) REFERENCES B_PROJECT(id),
        INDEX(project_id)
   );

   CREATE TABLE bravo.B_PROJECT(
               id INT NOT NULL AUTO_INCREMENT,
               name VARCHAR(255) NOT NULL,
               url_on_catalog VARCHAR(255) NOT NULL,
               url_external VARCHAR(255) NOT NULL,
               description VARCHAR(5000) NOT NULL,
               keywords VARCHAR(500) NOT NULL,
               fields_of_science VARCHAR(500) NOT NULL,
               isActive BOOLEAN NOT NULL DEFAULT FALSE,
               agency_sponsor VARCHAR(255),
               agency_sponsor_other VARCHAR(255),
               gov_contact VARCHAR(255),
               gov_contact_email VARCHAR(255),
               geographic_scope VARCHAR(255),
               participant_age VARCHAR(255) NOT NULL,
               participation_tasks VARCHAR(255) NOT NULL,
               scistarter BOOLEAN DEFAULT FALSE,
               email VARCHAR(255) NOT NULL,
               start_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
               project_goals VARCHAR(255) NOT NULL,
               created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
               updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
               PRIMARY KEY (id));

