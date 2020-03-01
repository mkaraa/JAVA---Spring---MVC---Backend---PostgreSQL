package clubs.com.example.clubs.Service;

import clubs.com.example.clubs.Entity.Post;
import clubs.com.example.clubs.Repository.EventRepository;
import clubs.com.example.clubs.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class PostService implements IBaseService<Post> {

    @Autowired
    @Qualifier("postRepository")
    private PostRepository postRepository;

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Post> getAll() {
        List<Post> all = postRepository.findAll();
        if(all != null) {
            all.stream().forEach(post -> {
                post.setEventId(eventRepository.findById(post.getPostId()).get().getEventId());
            });
        }
        return all;
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void update(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(List<Post> t) {
        postRepository.delete((Post) t);
    }
}
