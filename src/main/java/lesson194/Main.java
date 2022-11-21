package lesson194;

import lesson194.service.CommentService;
import lesson194.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b1);
        System.out.println(s1.getCommentRepository());
        System.out.println(s2.getCommentRepository());
    }

}
