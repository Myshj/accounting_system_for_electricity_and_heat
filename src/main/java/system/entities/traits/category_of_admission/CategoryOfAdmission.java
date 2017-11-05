package system.entities.traits.category_of_admission;

import lombok.Getter;
import lombok.Setter;
import system.entities.traits.SpecialistTrait;

import javax.persistence.*;

@Entity
public class CategoryOfAdmission extends SpecialistTrait {
    @Getter
    @Setter
    @EmbeddedId
    private CategoryOfAdmissionPK primaryKey;

    public CategoryOfAdmission() {
    }
}
