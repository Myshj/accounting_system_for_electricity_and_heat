package system.entities.traits.role;

import lombok.Data;
import system.entities.traits.SpecialistTraitPK;
import system.entities.types.TypeOfRole;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Data
@Embeddable
public class RolePK extends SpecialistTraitPK {
    @Enumerated
    private TypeOfRole type;

    public RolePK() {
    }
}
