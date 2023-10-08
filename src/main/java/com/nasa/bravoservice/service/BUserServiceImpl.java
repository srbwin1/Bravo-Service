package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BUser;
import com.nasa.bravoservice.repository.BUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BUserServiceImpl implements BUserService{


    @Autowired
    private BUserRepository bUserRepository;

    @Override
    public Flux<BUser> getAll() {
        return bUserRepository.findAll();
    }

    @Override
    public Mono<BUser> getBuserById(Long id) {
        return bUserRepository.findById(id);
    }
}
