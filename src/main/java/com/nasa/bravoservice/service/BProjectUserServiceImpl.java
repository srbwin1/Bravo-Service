package com.nasa.bravoservice.service;

import com.nasa.bravoservice.common.Constant;
import com.nasa.bravoservice.entity.BProjectUser;
import com.nasa.bravoservice.repository.BProjectUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author Rian Atri
 * @version 1.0
 */
@Service
public class BProjectUserServiceImpl implements BProjectUserService {

    @Autowired
    private BProjectUserRepository bProjectUserRepository;

    @Override
    public Flux<BProjectUser> getByUserId(Long id) {
        BProjectUser user = new BProjectUser();
        user.setUserId(id);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher(Constant.USER_ID, ExampleMatcher.GenericPropertyMatchers.exact());
        Example<BProjectUser> example = Example.of(user, matcher);
        return bProjectUserRepository.findAll(example);
    }
}
