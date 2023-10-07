package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BUserTag;
import com.nasa.bravoservice.service.BUserTagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class BUserTagController {

    private BUserTagService bUserTagService;

    @GetMapping("userTag")
    public Flux<BUserTag> getAll(){
        return bUserTagService.getAll();
    }


    @GetMapping("userTag/{id}")
    public Mono<BUserTag> getById(@PathVariable Long id){
        return bUserTagService.getBuserTagById(id);
    }
}
