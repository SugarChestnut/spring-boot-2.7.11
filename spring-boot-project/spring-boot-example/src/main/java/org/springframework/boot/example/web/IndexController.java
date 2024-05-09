package org.springframework.boot.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rtt
 * @date 2023/5/4 10:14
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String index() {
        return "Hello Spring Boot!";
    }
}
