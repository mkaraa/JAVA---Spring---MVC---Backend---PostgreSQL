package clubs.com.example.clubs.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @Column(nullable = false)
    private String commentId;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String postId;

    @Column(nullable = false)
    private String description;
}
