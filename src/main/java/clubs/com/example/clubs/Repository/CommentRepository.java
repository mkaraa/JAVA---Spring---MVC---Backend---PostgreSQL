package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.ClubUser;
import clubs.com.example.clubs.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {

}
