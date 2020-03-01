package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Club;
import clubs.com.example.clubs.Entity.ClubUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubUserRepository extends JpaRepository<ClubUser, String> {

}
