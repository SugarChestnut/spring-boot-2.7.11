package org.springframework.boot.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * yml 配置读取
 *
 * @author rtt
 * @date 2024/5/7 09:12
 */
@ConfigurationProperties(prefix = "normal")
public class NormalProperties {

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
