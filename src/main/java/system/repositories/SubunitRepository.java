package system.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.Subunit;

import java.util.List;

@RepositoryRestResource
public interface SubunitRepository extends PagingAndSortingRepository<Subunit, Long> {
    List<Subunit> findByName(
            @Param("name") String name
    );
}
