package demo.annotation;

import java.lang.reflect.Method;
import java.net.http.HttpRequest;

@CourseInfoAnnotation(courseName = "剑指java面试", courseTag = "面试", courseInfo = "讲解面试以及实战")
public class ImoocCourse {

    @PersonInfoAnnotation(name = "翔仔", languages = {"java", "c++"})
    private String author;

    @CourseInfoAnnotation(courseName = "校园商铺", courseTag = "实战", courseInfo = "一个ssm课程", courseIndex = 144)
    public void getCourseInfo(){
    }
}
