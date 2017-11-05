package system.entities.traits.position;

import lombok.Getter;
import lombok.Setter;
import system.entities.traits.SpecialistTrait;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Position extends SpecialistTrait {
    public Position() {
    }

    @Getter
    @Setter
    @EmbeddedId
    private PositionPK primaryKey;
}
