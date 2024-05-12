package org.springframework.boot.example.metadata;

import org.springframework.boot.example.SpringBootExampleApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;

/**
 * @author rtt
 * @date 2024/5/11 16:58
 */
public class AnnotationMetadataExample {

    public static void main(String[] args) throws IOException {
        CachingMetadataReaderFactory cachingMetadataReaderFactory = new CachingMetadataReaderFactory();
        MetadataReader metadataReader = cachingMetadataReaderFactory.getMetadataReader(SpringBootExampleApplication.class.getName());

        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        Resource resource = metadataReader.getResource();
    }
}
