package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Event;
import clubs.com.example.clubs.Entity.EventClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventClubRepository extends JpaRepository<EventClub, String> {

}
