package org.springframework.boot.example.factory;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;

/**
 * 在创建启动容器后调用
 *
 * @author rtt
 * @date 2023/5/4 13:24
 */
public class MyBootstrapRegistryInitializer implements BootstrapRegistryInitializer {

    public MyBootstrapRegistryInitializer() {
        System.out.println("MyBootstrapRegistryInitializer");
    }

    @Override
    public void initialize(BootstrapRegistry registry) {

    }
}
