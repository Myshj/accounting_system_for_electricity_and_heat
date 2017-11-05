package system.entities.traits;

import lombok.Getter;
import lombok.Setter;
import system.entities.Specialist;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class SpecialistTrait {

    @Getter
    @Setter
    @Temporal(TemporalType.DATE)
    private Date gained;

    public SpecialistTrait() {
    }
}
