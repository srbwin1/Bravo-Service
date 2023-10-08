package com.nasa.bravoservice.service;

import com.nasa.bravoservice.common.Constant;
import com.nasa.bravoservice.entity.BUserTag;
import com.nasa.bravoservice.repository.BUserTagRepository;
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
public class BUserTagServiceImpl implements BUserTagService {

    @Autowired
    private BUserTagRepository bUserTagRepository;

    @Override
    public Flux<BUserTag> getByTagId(Long id) {

        BUserTag tag = new BUserTag();
        tag.setUserId(id);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher(Constant.USER_ID, ExampleMatcher.GenericPropertyMatchers.exact());
        Example<BUserTag> example = Example.of(tag, matcher);
        return bUserTagRepository.findAll(example);
    }
}
