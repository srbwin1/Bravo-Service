package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BTag;
import com.nasa.bravoservice.service.BTagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class BTagController {

    private BTagService bTagService;

    @GetMapping("tag")
    public Flux<BTag> getAll(){
        return bTagService.getAll();
    }

    @GetMapping("tag/{id}")
    public Mono<BTag> getById(Long id){
        return bTagService.getBtagById(id);
    }
}
