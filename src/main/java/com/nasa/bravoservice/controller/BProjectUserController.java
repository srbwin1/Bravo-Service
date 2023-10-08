package com.nasa.bravoservice.controller;

import com.nasa.bravoservice.entity.BProjectUser;
import com.nasa.bravoservice.service.BProjectUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author Rian Atri
 * @version 1.0
 */
@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class BProjectUserController {

    private BProjectUserService bProjectUserService;

    @GetMapping("project-user/{id}")
    public Flux<BProjectUser> getByUserID(@PathVariable Long id) {
        return bProjectUserService.getByUserId(id);
    }
}
