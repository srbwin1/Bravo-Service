package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProjectUser;
import com.nasa.bravoservice.repositories.BProjectUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BProjectUserServiceImpl implements BProjectUserService {


    @Autowired
    private BProjectUserRepository bProjectUserRepository;

    @Override
    public Flux<BProjectUser> getAll() {
        return bProjectUserRepository.findAll();
    }

    @Override
    public Mono<BProjectUser> getBProjectUserById(Long id) {
        return getBProjectUserById(id);
    }
}
