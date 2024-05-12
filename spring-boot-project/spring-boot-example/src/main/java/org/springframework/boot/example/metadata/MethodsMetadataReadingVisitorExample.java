package org.springframework.boot.example.metadata;

import org.springframework.boot.example.SpringBootExampleApplication;
import org.springframework.boot.example.util.PrintUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;
import java.util.Set;

/**
 * spring acm 解析 class 文件，获取注解信息
 */
public class MethodsMetadataReadingVisitorExample {

    public static void main(String[] args) {
        PrintUtils.print(MethodsMetadataReadingVisitorExample::main0);
    }

    public static void main0() throws IOException {
        CachingMetadataReaderFactory cachingMetadataReaderFactory = new CachingMetadataReaderFactory();

        MetadataReader metadataReader = cachingMetadataReaderFactory.getMetadataReader(SpringBootExampleApplication.class.getName());

        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();

        annotationTypes.forEach(annotationType -> {
            System.out.println("-------------------");
            System.out.println(annotationType);
            System.out.println(annotationMetadata.getAnnotationAttributes(annotationType));
            System.out.println();
            Set<String> metaAnnotationTypes = annotationMetadata.getMetaAnnotationTypes(annotationType);
            metaAnnotationTypes.forEach(metaAnnotationType -> {
                System.out.println(metaAnnotationType);
                System.out.println(annotationMetadata.getAnnotationAttributes(metaAnnotationType));
                System.out.println();
            });
        });

        // 接口、父类、方法等
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // class 文件地址
        Resource resource = metadataReader.getResource();
    }
}
