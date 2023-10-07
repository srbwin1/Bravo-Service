package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BProject;
import com.nasa.bravoservice.service.BProjectService;
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
public class BProjectController {

    private BProjectService bProjectService;

    @GetMapping(value = "health")
    public Mono<String> healthy(){
        return Mono.just("Healthy");
    }

    @GetMapping("project")
    public Flux<BProject> getAll(){
        return bProjectService.getAll();
    }
}
