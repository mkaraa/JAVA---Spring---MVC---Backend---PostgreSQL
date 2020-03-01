package clubs.com.example.clubs.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Entity
@Data
public class University {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String name;
}
