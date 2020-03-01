package clubs.com.example.clubs.Repository;

import clubs.com.example.clubs.Entity.Category;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
