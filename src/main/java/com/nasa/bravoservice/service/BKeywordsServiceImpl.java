package com.nasa.bravoservice.service;

import com.nasa.bravoservice.common.Constant;
import com.nasa.bravoservice.entity.BKeywords;
import com.nasa.bravoservice.repository.BKeywordsRepository;
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
public class BKeywordsServiceImpl implements BKeywordsService{

    @Autowired
    private BKeywordsRepository bKeywordsRepository;

    @Override
    public Flux<BKeywords> getAll(){
        return bKeywordsRepository.findAll();
    }

    @Override
    public Flux<BKeywords> getBKeywordsByName(String name) {
        BKeywords keyword = new BKeywords();
        keyword.setName(name);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher(Constant.Name, ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        Example<BKeywords> example = Example.of(keyword, matcher);
        return bKeywordsRepository.findAll(example);
    }
}
