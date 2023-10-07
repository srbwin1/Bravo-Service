package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BTag;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BTagService {

    Flux<BTag> getAll();

    Mono<BTag> getBtagById(Long id);
}
