package com.nasa.bravoservice.repositories;


import com.nasa.bravoservice.entity.BProjectUser;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@Repository
public interface BProjectTagRepository extends R2dbcRepository<BProjectUser, Long> {
}
