package demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseInfoAnnotation {

    public String courseName();
    public String courseTag();
    public String courseInfo();
    public int courseIndex() default 303;
}
