package BadgeAndMembership.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "emailName")
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToMany
    @JoinTable(name = "MemberRoles"
            , joinColumns = {@JoinColumn(name = "MemberId")}
            , inverseJoinColumns = {@JoinColumn(name = "RoleId")})
    private Collection<Role> roles;
    @OneToMany(mappedBy = "member", cascade = CascadeType.PERSIST)
    private Collection<Badge> badges;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "MemberId")
    private Collection<Membership> memberships;
}
