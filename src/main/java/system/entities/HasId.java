package system.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class HasId {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    public HasId() {
    }
}
