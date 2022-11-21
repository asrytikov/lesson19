package lesson19;

import lesson19.service.CommentService;
import lesson19.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b1);
    }

}
