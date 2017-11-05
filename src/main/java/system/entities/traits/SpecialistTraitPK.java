package system.entities.traits;

import lombok.Data;
import system.entities.Specialist;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class SpecialistTraitPK implements Serializable {
    @ManyToOne
    protected Specialist specialist;
}
