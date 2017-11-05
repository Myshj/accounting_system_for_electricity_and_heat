package system.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.indication.Indication;
import system.entities.indication.IndicationPK;

@RepositoryRestResource
public interface IndicationRepository
        extends PagingAndSortingRepository<
        Indication,
        IndicationPK
        > {
}
