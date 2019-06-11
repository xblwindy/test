package com.jcohy.scis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "instruments")
public class MusicService {

    private static Logger log = LoggerFactory.getLogger(MusicService.class);
    @CacheEvict(allEntries = true)
    public void clearCache(){}

    // 表示的是属性为 trombone 就进行缓存
    @Cacheable(condition = "#instrument.equals('trombone')")
    public String play(String instrument){

        log.info("Executing: " + this.getClass().getSimpleName() + ".play(\"" + instrument + "\");");
        return "playing " + instrument + "!";
    }
}