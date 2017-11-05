package system.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.places.Place;
import system.entities.places.PlacePK;

@RepositoryRestResource
public interface PlaceRepository
        extends PagingAndSortingRepository<
        Place,
        PlacePK
        > {
}
