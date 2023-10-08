package com.nasa.bravoservice.repository;

import com.nasa.bravoservice.entity.BUser;
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
public interface BUserRepository extends R2dbcRepository<BUser, Long> {

}
