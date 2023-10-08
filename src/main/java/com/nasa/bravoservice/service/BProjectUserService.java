package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectUser;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BProjectUserService {

    Flux<BProjectUser> getByUserId(Long id);
}
