package org.springframework.boot.example.lifecycle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author rtt
 * @date 2023/5/4 13:33
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    public MyApplicationListener() {
        System.out.println("MyApplicationListener");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }
}
