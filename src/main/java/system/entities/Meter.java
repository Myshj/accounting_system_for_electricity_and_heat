package system.entities;

import lombok.Getter;
import lombok.Setter;
import system.entities.places.Place;
import system.entities.types.TypeOfMeter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Meter extends HasId {
    @Getter
    @Setter
    @ManyToOne
    private Place place;

    @Getter
    @Setter
    @Enumerated
    private TypeOfMeter type;

    public Meter() {

    }
}
