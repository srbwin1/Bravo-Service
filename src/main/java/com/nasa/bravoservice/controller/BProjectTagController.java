package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BProjectTag;
import com.nasa.bravoservice.service.BProjectTagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author Rian Atri
 * @version 1.0
 */
@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class BProjectTagController {

    private BProjectTagService bProjectTagService;

    @GetMapping("project-tag")
    public Flux<BProjectTag> getAll() {
        return bProjectTagService.getAll();
    }


    @GetMapping("project-tag/{id}")
    public Flux<BProjectTag> getById(@PathVariable Long id) {
        return bProjectTagService.getByTagId(id);
    }
}
