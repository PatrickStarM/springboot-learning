package com.mth.boot.restful.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/13
 **/
@Configuration
public class OpenAPIConfig {
    @Bean
    public GroupedOpenApi articleApi() {
        return GroupedOpenApi.builder().group("api-v1-articles").pathsToMatch("/api/v1/articles/**").build();
    }

    @Bean
    public GroupedOpenApi helloApi() {
        return GroupedOpenApi.builder().group("hello").pathsToMatch("/hello/**").build();
    }
}
