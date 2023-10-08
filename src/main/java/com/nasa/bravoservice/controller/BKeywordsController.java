package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BKeywords;
import com.nasa.bravoservice.service.BKeywordsService;
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
public class BKeywordsController {

    private BKeywordsService bKeywordsService;

    @GetMapping("keywords")
    public Flux<BKeywords> getAll() {
        return bKeywordsService.getAll();
    }


    @GetMapping("keywords/{name}")
    public Flux<BKeywords> getByName(@PathVariable String name) {
        return bKeywordsService.getBKeywordsByName(name);
    }
}
