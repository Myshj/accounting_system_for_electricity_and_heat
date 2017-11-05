package system.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.Specialist;

import java.util.List;

@RepositoryRestResource
public interface SpecialistRepository extends PagingAndSortingRepository<Specialist, Long> {
    List<Specialist> findByFirstName(
            @Param("firstName") String firstName
    );

    List<Specialist> findByLastName(
            @Param("lastName") String lastName
    );

    List<Specialist> findByLastNameStartsWithIgnoreCase(
            @Param("filterText") String filterText
    );
}
