package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProject;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BProjectService {

    Flux<BProject> getAll();

    Mono<BProject> getBProjectById(Long id);
}
