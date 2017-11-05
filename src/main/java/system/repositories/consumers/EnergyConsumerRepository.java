package system.repositories.consumers;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.consumers.EnergyConsumer;

@RepositoryRestResource
public interface EnergyConsumerRepository
        extends PagingAndSortingRepository<
        EnergyConsumer, Long
        > {
}
