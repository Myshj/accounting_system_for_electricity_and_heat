package system.entities.traits.category_of_admission;

import lombok.Data;
import system.entities.traits.SpecialistTraitPK;
import system.entities.types.TypeOfCategoryOfAdmission;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

@Data
@Embeddable
public class CategoryOfAdmissionPK extends SpecialistTraitPK {
    public CategoryOfAdmissionPK() {
    }

    @Enumerated
    private TypeOfCategoryOfAdmission type;
}
