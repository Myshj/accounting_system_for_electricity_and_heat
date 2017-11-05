package system.entities.indication;

import lombok.Data;
import system.entities.Meter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
public class IndicationPK implements Serializable {
    @ManyToOne
    private Meter meter;

    @Temporal(TemporalType.DATE)
    private Date date;

    public IndicationPK() {
    }
}
