package system.entities.consumers;

import lombok.Getter;
import lombok.Setter;
import system.entities.types.TypeOfHeatEnergy;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class HeatConsumer extends EnergyConsumer {
    @Getter
    @Setter
    @Enumerated
    private TypeOfHeatEnergy type;

    @Getter
    @Setter
    private Double summerConsumption;

    @Getter
    @Setter
    private Double WinterConsumption;

    public HeatConsumer() {
    }
}
