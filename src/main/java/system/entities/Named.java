package system.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public abstract class Named extends HasId {
    @Getter
    @Setter
    private String name;
}
