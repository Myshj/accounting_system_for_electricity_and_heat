package system.repositories.consumers;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ElectricityConsumerRepository
        extends PagingAndSortingRepository<
        system.entities.consumers.ElectricityConsumer, Long
        > {
}
