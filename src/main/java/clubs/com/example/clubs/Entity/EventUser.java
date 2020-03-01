package clubs.com.example.clubs.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventUser {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String eventId;

    @Column(nullable = false)
    private String userId;
}
