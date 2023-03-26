package BadgeAndMembership.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "badge")
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "badgeUid")
    private String badgeUid;
    @ManyToOne
    @JoinColumn(name = "member")
    private Member member;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
    @Column(name = "isActive")
    private boolean isActive;
    @Column(name = "modifiedDate")
    private LocalDateTime modifiedDate;
}
