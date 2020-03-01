package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Comment;
import clubs.com.example.clubs.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

}
