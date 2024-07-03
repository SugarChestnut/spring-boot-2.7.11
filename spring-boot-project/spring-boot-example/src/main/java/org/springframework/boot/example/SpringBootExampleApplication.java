package org.springframework.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.example.autoconfiguration.bean.Formatter;
import org.springframework.boot.example.lifecycle.MyApplicationRunner;
import org.springframework.boot.example.util.PrintUtils;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 *  配置源
 */
@SpringBootApplication
public class SpringBootExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootExampleApplication.class, args);
        // 入口
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(SpringBootExampleApplication.class)
                .web(WebApplicationType.NONE)
                .properties()
                .profiles()
                .run(args);

        Map<String, Formatter> formatterMap = applicationContext.getBeansOfType(Formatter.class);
        formatterMap.forEach((key, value) -> {
            PrintUtils.print(key);
            PrintUtils.print(value.getClass().getName());
        });

        applicationContext.close();

        System.getProperties().forEach((key, value) -> System.out.println(key + "--" + value));
    }


}
