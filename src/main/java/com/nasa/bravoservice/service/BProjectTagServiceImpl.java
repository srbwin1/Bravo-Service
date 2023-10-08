package com.nasa.bravoservice.service;

import com.nasa.bravoservice.common.Constant;
import com.nasa.bravoservice.entity.BProjectTag;
import com.nasa.bravoservice.repository.BProjectTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BProjectTagServiceImpl implements BProjectTagService {


    @Autowired
    private BProjectTagRepository bProjectTagRepository;

    @Override
    public Flux<BProjectTag> getAll() {
        return bProjectTagRepository.findAll();
    }

    @Override
    public Flux<BProjectTag> getByTagId(Long id) {
        BProjectTag projectTag = new BProjectTag();
        projectTag.setTag_id(id);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher(Constant.TAG_ID, ExampleMatcher.GenericPropertyMatchers.exact());
        Example<BProjectTag> example = Example.of(projectTag, matcher);
        return bProjectTagRepository.findAll(example);
    }
}
