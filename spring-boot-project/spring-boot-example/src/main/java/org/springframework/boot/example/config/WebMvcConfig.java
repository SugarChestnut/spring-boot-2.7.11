package org.springframework.boot.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author rtt
 * @date 2024/5/11 09:53
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final CommonInterceptor commonInterceptor;

    @Autowired
    public WebMvcConfig(CommonInterceptor commonInterceptor) {
        this.commonInterceptor = commonInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor);
    }
}
