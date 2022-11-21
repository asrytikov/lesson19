package lesson19.service;

import lesson19.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repo;

    public CommentRepository getCommentRepository() {
        return repo;
    }
}
