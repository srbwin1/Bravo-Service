package com.nasa.bravoservice.repository;


import com.nasa.bravoservice.entity.BProjectTag;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@Repository
public interface BProjectTagRepository extends R2dbcRepository<BProjectTag, Long> {
}
