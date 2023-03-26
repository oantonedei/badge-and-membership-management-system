package contracts.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

@Data
@ToString
public class MemberDto implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Collection<Role> roles;
}
