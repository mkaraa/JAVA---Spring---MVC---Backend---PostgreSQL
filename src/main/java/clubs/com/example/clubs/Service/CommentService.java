package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Comment;
import clubs.com.example.clubs.Repository.CommentRepository;
import clubs.com.example.clubs.Repository.PostRepository;
import clubs.com.example.clubs.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class CommentService implements IBaseService<Comment>{

    @Autowired
    @Qualifier("commentRepository")
    private CommentRepository commentRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Comment> getAll() {
        List<Comment> all = commentRepository.findAll();
        if(all != null ) {
            all.stream().forEach(comment -> {
                comment.setPostId(postRepository.findById(comment.getPostId()).get().getPostId());
                comment.setUserId(usersRepository.findById(comment.getUserId()).get().getId());
            });
        }
        return all;
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void update(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void delete(List<Comment> t) {
        commentRepository.delete((Comment) t);
    }
}
