package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectTag;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BProjectTagService {

    Flux<BProjectTag> getAll();

    Flux<BProjectTag> getByTagId(Long id);
}
