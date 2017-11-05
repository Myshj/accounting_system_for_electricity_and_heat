package system.entities.consumers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class ElectricityConsumer extends EnergyConsumer {
    @Getter
    @Setter
    private Double nominalPower;

    @Getter
    @Setter
    private Double averageDayConsumption;

    @Getter
    @Setter
    private Double nominalCurrent;

    @Getter
    @Setter
    private Double maximalCurrent;

    @Getter
    @Setter
    private Double maximalVoltage;

    @Getter
    @Setter
    private Double nominalVoltage;

    public ElectricityConsumer() {
    }
}
