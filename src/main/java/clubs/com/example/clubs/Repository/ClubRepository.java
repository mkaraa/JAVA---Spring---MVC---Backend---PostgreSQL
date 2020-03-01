package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, String> {

}
