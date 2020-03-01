package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Event;
import clubs.com.example.clubs.Entity.EventUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventUserRepository extends JpaRepository<EventUser, String> {

}
