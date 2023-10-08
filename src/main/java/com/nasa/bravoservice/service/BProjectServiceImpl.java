package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BProject;
import com.nasa.bravoservice.repository.BProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BProjectServiceImpl implements BProjectService{


    @Autowired
    private BProjectRepository bProjectRepository;

    @Override
    public Flux<BProject> getAll() {
        return bProjectRepository.findAll();
    }

    @Override
    public Mono<BProject> getBProjectById(Long id) {
        return bProjectRepository.findById(id);
    }
}
