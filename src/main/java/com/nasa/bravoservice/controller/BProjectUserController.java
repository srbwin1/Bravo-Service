package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BProjectUser;
import com.nasa.bravoservice.service.BProjectUserService;
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
public class BProjectUserController {

    private BProjectUserService bProjectUserService;

    @GetMapping("projectUser")
    public Flux<BProjectUser> getAll(){
        return bProjectUserService.getAll();
    }
}
