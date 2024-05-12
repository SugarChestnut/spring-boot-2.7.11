package org.springframework.boot.example.metadata;

import org.springframework.boot.example.SpringBootExampleApplication;
import org.springframework.boot.example.util.PrintUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StandardAnnotationMetadataExample {

    public static void main(String[] args) {
        PrintUtils.print(StandardAnnotationMetadataExample::main0);
    }

    public static void main0() {
        AnnotationMetadata annotationMetadata = AnnotationMetadata.introspect(SpringBootExampleApplication.class);

        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();

        Set<String> metaAnnotationTypes = annotationTypes.stream().map(annotationMetadata::getMetaAnnotationTypes)
                .collect(LinkedHashSet::new, Set::addAll, Set::addAll);

        metaAnnotationTypes.forEach(metaAnnotationType -> {
            Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(metaAnnotationType);
            if (!CollectionUtils.isEmpty(annotationAttributes)) {
                annotationAttributes.forEach((key, value) -> {
                    System.out.println(ClassUtils.getShortName(key) + "---" + value);
                });
            }
        });
    }
}
