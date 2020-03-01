package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.University;
import clubs.com.example.clubs.Entity.UniversityClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityClubRepository extends JpaRepository<UniversityClub, String> {

}
