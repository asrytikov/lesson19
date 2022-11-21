package lesson192;

import lesson192.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before");
        var service = c.getBean(CommentService.class);
        System.out.println("After");
    }
}
