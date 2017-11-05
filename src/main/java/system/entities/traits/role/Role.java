package system.entities.traits.role;

import lombok.Getter;
import lombok.Setter;
import system.entities.traits.SpecialistTrait;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Role extends SpecialistTrait {
    @Getter
    @Setter
    @EmbeddedId
    private RolePK primaryKey;

    public Role() {
    }
}
