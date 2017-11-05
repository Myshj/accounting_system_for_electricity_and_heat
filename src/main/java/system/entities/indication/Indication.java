package system.entities.indication;

import lombok.Getter;
import lombok.Setter;
import system.entities.Specialist;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Indication {
    @Getter
    @Setter
    @ManyToOne
    private Specialist entered;

    @Getter
    @Setter
    private Double value;

    @EmbeddedId
    private IndicationPK primaryKey;

    public Indication() {
    }
}
