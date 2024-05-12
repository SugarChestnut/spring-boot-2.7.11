package org.springframework.boot.example.util;

import java.util.function.Function;

public class PrintUtils {

    public static void print(Action action) {
        System.out.println("\n\n=======================");
        try {
            action.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("=======================\n\n");
    }
}
