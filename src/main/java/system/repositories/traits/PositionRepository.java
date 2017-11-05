package system.repositories.traits;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.traits.position.Position;
import system.entities.traits.position.PositionPK;
import system.entities.types.TypeOfPosition;

import java.util.List;

@RepositoryRestResource
public interface PositionRepository
        extends PagingAndSortingRepository<
        Position,
        PositionPK
        > {
    List<Position> findByPrimaryKey_SpecialistId(
            @Param("specialistId") Long specialistId
    );

    List<Position> findByPrimaryKey_Type(
            @Param("type") TypeOfPosition type
    );
}
