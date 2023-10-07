package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BUser;
import com.nasa.bravoservice.service.BUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author Rian Atri
 * @version 1.0
 */
@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class BUserController {

    private BUserService bUserService;

    @GetMapping("user")
    public Flux<BUser> getAll(){
        return bUserService.getAll();
    }
}
