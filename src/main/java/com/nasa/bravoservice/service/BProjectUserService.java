package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectUser;
import reactor.core.publisher.Flux;

public interface BProjectUserService {

    Flux<BProjectUser> getByUserId(Long id);
}
