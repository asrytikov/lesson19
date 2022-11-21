package lesson194.service;

import lesson194.CommentProcessor;
import lesson194.model.Comment;
import lesson194.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private CommentRepository repo;

 /*   @Autowired
    private CommentProcessor p;*/

    public CommentRepository getCommentRepository() {
        return repo;
    }

    public void sendComment(Comment comment){
        CommentProcessor p = context.getBean(CommentProcessor.class);
        p.setComment(comment);
        p.processComment(comment);
        p.validateComment(comment);
        comment = p.getComment();
    }
}
