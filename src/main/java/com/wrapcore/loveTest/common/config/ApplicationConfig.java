package com.wrapcore.loveTest.common.config;/*
 * author		: sp91l
 * date			: 2022-05-20_오후 2:18
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-20_오후 2:18	    sp91l				최초생성
 * */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    @Bean
    public Gson gson(){
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
