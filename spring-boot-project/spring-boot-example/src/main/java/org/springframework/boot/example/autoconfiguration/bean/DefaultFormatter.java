package org.springframework.boot.example.autoconfiguration.bean;

public class DefaultFormatter implements Formatter{

    @Override
    public String format(Object object) {
        return String.valueOf(object);
    }
}
