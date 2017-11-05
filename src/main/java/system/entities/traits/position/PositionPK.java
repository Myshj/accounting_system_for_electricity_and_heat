package system.entities.traits.position;

import lombok.Data;
import system.entities.traits.SpecialistTraitPK;
import system.entities.types.TypeOfPosition;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Data
@Embeddable
public class PositionPK extends SpecialistTraitPK {
    @Enumerated
    private TypeOfPosition type;

    public PositionPK() {
    }
}
