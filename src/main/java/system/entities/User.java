package system.entities;

import lombok.Getter;
import lombok.Setter;
import system.entities.types.TypeOfRole;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Enumerated
    @Getter
    @Setter
    private TypeOfRole role;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.role = TypeOfRole.EXECUTOR;
    }
}
