package com.nasa.bravoservice.repositories;

import com.nasa.bravoservice.entity.BProject;
import org.jetbrains.annotations.NotNull;
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
public interface BProjectRepository extends R2dbcRepository<BProject, Long> {

    @NotNull
    @Override
    Flux<BProject> findAll();

    @NotNull
    @Override
    Mono<BProject> findById(@NotNull Long id);


}
