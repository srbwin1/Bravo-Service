package com.nasa.bravoservice.service;

import com.nasa.bravoservice.entity.BKeywords;
import reactor.core.publisher.Flux;

public interface BKeywordsService {

    Flux<BKeywords> getAll();

    Flux<BKeywords> getBKeywordsByName(String name);

}
