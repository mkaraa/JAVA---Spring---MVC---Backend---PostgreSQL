package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Post;
import clubs.com.example.clubs.Entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, String> {

}
