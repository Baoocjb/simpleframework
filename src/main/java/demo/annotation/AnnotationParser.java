package demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationParser {
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("demo.annotation.ImoocCourse");
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations){
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println(courseInfoAnnotation.courseName() );
            System.out.println(courseInfoAnnotation.courseTag());
        }
    }

    public static void parseFieldAnnotation() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazz = Class.forName("demo.annotation.ImoocCourse");
        Field author = clazz.getDeclaredField("author");
        boolean hasPersonInfoAnnotation = author.isAnnotationPresent(PersonInfoAnnotation.class);
        if (hasPersonInfoAnnotation) {
            PersonInfoAnnotation annotation = author.getAnnotation(PersonInfoAnnotation.class);
            System.out.println(annotation.name());
            String[] languages = annotation.languages();
            for(String language : languages){
                System.out.println(language);
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        parseTypeAnnotation();
        parseFieldAnnotation();
    }
}
