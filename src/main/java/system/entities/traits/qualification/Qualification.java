package system.entities.traits.qualification;

import lombok.Getter;
import lombok.Setter;
import system.entities.traits.SpecialistTrait;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Qualification extends SpecialistTrait {
    @Getter
    @Setter
    @EmbeddedId
    private QualificationPK primaryKey;

    public Qualification() {
    }
}
