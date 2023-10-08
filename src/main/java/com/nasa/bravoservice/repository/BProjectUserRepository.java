package com.nasa.bravoservice.repository;

import com.nasa.bravoservice.entity.BProjectUser;
import org.springframework.data.r2dbc.repository.R2dbcRepository;



public interface BProjectUserRepository extends R2dbcRepository<BProjectUser, Long> {

}
