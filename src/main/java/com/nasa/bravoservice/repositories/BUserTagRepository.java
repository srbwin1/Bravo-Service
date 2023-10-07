package com.nasa.bravoservice.repositories;

import com.nasa.bravoservice.entity.BUserTag;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@Repository
public interface BUserTagRepository extends R2dbcRepository<BUserTag, Long> {

    @Override
    Flux<BUserTag> findAll();

    @Override
    Mono<BUserTag> findById(Long id);


}
