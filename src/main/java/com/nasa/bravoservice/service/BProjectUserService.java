package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectUser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BProjectUserService {

    Flux<BProjectUser> getAll();

    Mono<BProjectUser> getBProjectUserById(Long id);
}
