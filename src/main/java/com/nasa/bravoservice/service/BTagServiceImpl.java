package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BTag;
import com.nasa.bravoservice.repository.BTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BTagServiceImpl implements BTagService {


    @Autowired
    private BTagRepository bTagRepository;

    @Override
    public Flux<BTag> getAll() {
        return bTagRepository.findAll();
    }

    @Override
    public Mono<BTag> getBtagById(Long id) {
        return bTagRepository.findById(id);
    }
}
