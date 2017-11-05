package system.repositories.consumers;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.consumers.HeatConsumer;

@RepositoryRestResource
public interface HeatConsumerRepository
        extends PagingAndSortingRepository<
        HeatConsumer, Long
        > {
}
