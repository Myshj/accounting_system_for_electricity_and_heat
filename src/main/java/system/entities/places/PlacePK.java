package system.entities.places;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import system.entities.types.TypeOfPlace;
import system.entities.consumers.EnergyConsumer;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class PlacePK implements Serializable {
    @Getter
    @Setter
    @ManyToOne
    private EnergyConsumer consumer;

    @Getter
    @Setter
    @Enumerated
    private TypeOfPlace type;

    public PlacePK() {
    }
}
