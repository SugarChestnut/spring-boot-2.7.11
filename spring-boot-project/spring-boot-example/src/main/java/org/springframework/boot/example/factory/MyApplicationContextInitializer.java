package org.springframework.boot.example.factory;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.lang.NonNull;

/**
 * @author rtt
 * @date 2023/5/4 13:25
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    public MyApplicationContextInitializer() {
        System.out.println("MyApplicationContextInitializer");
    }

    @Override
    public void initialize(@NonNull ConfigurableApplicationContext applicationContext) {

    }
}
