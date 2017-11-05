package system.entities.places;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Place {
    @EmbeddedId
    @Getter
    @Setter
    private PlacePK primaryKey;

    public Place() {
    }
}
