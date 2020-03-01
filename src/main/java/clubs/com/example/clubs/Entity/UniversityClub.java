package clubs.com.example.clubs.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UniversityClub {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String clubId;

    @Column(nullable = false)
    private String universityId;
}
