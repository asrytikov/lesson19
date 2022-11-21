package lesson194.service;

import lesson194.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CommentRepository repo;

    public CommentRepository getCommentRepository() {
        return repo;
    }
}


