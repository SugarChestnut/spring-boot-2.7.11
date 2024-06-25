package org.springframework.boot.example.lifecycle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author rtt
 * @date 2023/5/4 13:33
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    public MyApplicationListener() {
        System.out.println("MyApplicationListener");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("[MyApplicationListener]" + event.getClass());
    }
}
