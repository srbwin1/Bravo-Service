package com.nasa.bravoservice.repository;

import com.nasa.bravoservice.entity.BUserTag;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@Repository
public interface BUserTagRepository extends R2dbcRepository<BUserTag, Long> {
}
