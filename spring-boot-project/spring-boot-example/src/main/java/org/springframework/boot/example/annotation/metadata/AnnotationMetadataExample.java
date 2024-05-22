package org.springframework.boot.example.annotation.metadata;

import org.springframework.boot.example.SpringBootExampleApplication;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

/**
 * @author rtt
 * @date 2024/5/11 16:58
 */
public class AnnotationMetadataExample {

    public static void main(String[] args) throws IOException {

        System.out.println("\n\n==============================");

        // 所有类都隐式实现 AnnotatedElement 接口
        AnnotatedElement annotatedElement = SpringBootExampleApplication.class;
        Annotation[] annotations = annotatedElement.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        AnnotationAttributes attributes = AnnotatedElementUtils
                .getMergedAnnotationAttributes(SpringBootExampleApplication.class, ComponentScan.class);
        assert attributes != null;
        attributes.forEach((name, value) -> {
            System.out.println(name + "---" +value);
        });

        System.out.println("=======================\n\n");
    }
}
