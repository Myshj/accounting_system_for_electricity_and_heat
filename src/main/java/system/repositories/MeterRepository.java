package system.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.Meter;

@RepositoryRestResource
public interface MeterRepository
        extends PagingAndSortingRepository<
        Meter,
        Long
        > {
}
