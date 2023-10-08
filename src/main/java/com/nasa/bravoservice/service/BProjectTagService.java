package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectTag;
import reactor.core.publisher.Flux;

public interface BProjectTagService {

    Flux<BProjectTag> getAll();

    Flux<BProjectTag> getByTagId(Long id);
}
