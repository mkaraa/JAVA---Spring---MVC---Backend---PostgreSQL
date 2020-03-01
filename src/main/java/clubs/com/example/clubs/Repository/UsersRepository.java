package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.University;
import clubs.com.example.clubs.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}
