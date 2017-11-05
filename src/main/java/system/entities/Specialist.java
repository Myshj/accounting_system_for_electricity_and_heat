package system.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Specialist extends HasId implements Serializable {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String secondName;

    @Getter
    @Setter
    private String lastName;

    public Specialist() {
    }

    public Specialist(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
}
