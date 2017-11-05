package system.entities.consumers;

import lombok.Getter;
import lombok.Setter;
import system.entities.Named;
import system.entities.Specialist;
import system.entities.Subunit;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class EnergyConsumer extends Named {

    @Getter
    @Setter
    @ManyToOne
    private Specialist responsible;

    @Getter
    @Setter
    @ManyToOne
    private Subunit subunit;

    public EnergyConsumer() {
    }
}
