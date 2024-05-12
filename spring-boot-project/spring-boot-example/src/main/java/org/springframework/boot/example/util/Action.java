package org.springframework.boot.example.util;

import java.io.IOException;

@FunctionalInterface
public interface Action {

    void execute() throws IOException;
}

