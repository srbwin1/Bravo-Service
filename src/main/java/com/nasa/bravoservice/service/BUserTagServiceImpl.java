package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BUserTag;
import com.nasa.bravoservice.repositories.BUserTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BUserTagServiceImpl implements BUserTagService {


    @Autowired
    private BUserTagRepository bUserTagRepository;

    @Override
    public Flux<BUserTag> getAll() {
        return bUserTagRepository.findAll();
    }

    @Override
    public Mono<BUserTag> getBuserTagById(Long id) {
        return bUserTagRepository.findById(id);
    }
}
