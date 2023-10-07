package com.nasa.bravoservice.repositories;

import com.nasa.bravoservice.entity.BProjectUser;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BProjectUserRepository extends R2dbcRepository<BProjectUser, Long> {
}
