package system.entities.traits.qualification;

import lombok.Data;
import system.entities.Specialist;
import system.entities.traits.SpecialistTraitPK;
import system.entities.types.TypeOfQualification;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Data
@Embeddable
public class QualificationPK extends SpecialistTraitPK {
    @Enumerated
    private TypeOfQualification type;

    public QualificationPK() {
    }
}
