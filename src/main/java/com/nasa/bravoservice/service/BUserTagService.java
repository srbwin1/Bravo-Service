package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BUserTag;
import reactor.core.publisher.Flux;

public interface BUserTagService {

    Flux<BUserTag> getByTagId(Long id);
}
