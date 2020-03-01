package clubs.com.example.clubs.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String name;
}
