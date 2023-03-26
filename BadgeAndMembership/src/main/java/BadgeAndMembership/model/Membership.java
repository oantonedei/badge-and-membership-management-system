package BadgeAndMembership.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "membership")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "startDate")
    private LocalDate startDate;
    @Column(name = "endDate")
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "planId")
    private Plan plan;
    @Enumerated(EnumType.STRING)
    @Column(name = "membershipType")
    private MembershipType membershipType;
    @Column(name = "numberOfAllowanceLimit")
    private int numberOfAllowanceLimit;
    @Enumerated(EnumType.STRING)
    @Column(name = "limitResetTimePeriod")
    private LimitResetTimePeriod limitResetTimePeriod;
    @Column(name = "isSingleEntryPerTimeSlot")
    private boolean isSingleEntryPerTimeSlot;
}
