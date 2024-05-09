package org.springframework.boot.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author rtt
 * @date 2024/5/9 14:20
 */
@Component
public class NormalConfiguration {

    @Bean
    public HandlerInterceptor normalInterceptor() {
        return new NormalInterceptor();
    }
}
