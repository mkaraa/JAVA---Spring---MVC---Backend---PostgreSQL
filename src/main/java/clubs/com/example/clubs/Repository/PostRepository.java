package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.EventUser;
import clubs.com.example.clubs.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {

}
