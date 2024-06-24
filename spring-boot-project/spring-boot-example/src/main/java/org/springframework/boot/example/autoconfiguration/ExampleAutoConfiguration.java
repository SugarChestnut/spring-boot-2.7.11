package org.springframework.boot.example.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.example.autoconfiguration.bean.DefaultFormatter;
import org.springframework.boot.example.autoconfiguration.bean.Formatter;
import org.springframework.boot.example.autoconfiguration.bean.JsonFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用 @AutoConfiguration 不能被解析
 * {@link org.springframework.boot.autoconfigure.SpringBootApplication} 添加了扫描过过滤 {@link AutoConfigurationExcludeFilter}
 * {@link AutoConfiguration} 注解无法被 {@link ComponentScan} 识别
 */
@AutoConfiguration
//@Configuration(proxyBeanMethods = false)
public class ExampleAutoConfiguration {

    @Bean
    public Formatter defaultFormatter() {
        return new DefaultFormatter();
    }

    @Bean
    public Formatter jsonFormatter() {
        return new JsonFormatter();
    }
}
