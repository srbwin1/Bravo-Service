package com.nasa.bravoservice.repositories;

import com.nasa.bravoservice.entity.BTag;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BTagRepository extends R2dbcRepository<BTag, Long> {

}
