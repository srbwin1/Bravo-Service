package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BUser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BUserService {

    Flux<BUser> getAll();

    Mono<BUser> getBuserById(Long id);
}
