package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BUserTag;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BUserTagService {

    Flux<BUserTag> getAll();

    Mono<BUserTag> getBuserTagById(Long id);
}
