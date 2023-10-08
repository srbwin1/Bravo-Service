package com.nasa.bravoservice.repository;

import com.nasa.bravoservice.entity.BKeywords;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BKeywordsRepository extends R2dbcRepository<BKeywords, Long> {
}
