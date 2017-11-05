package system.repositories.traits;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.traits.role.Role;
import system.entities.traits.role.RolePK;
import system.entities.types.TypeOfRole;

import java.util.List;

@RepositoryRestResource
public interface RoleRepository
        extends PagingAndSortingRepository<
        Role,
        RolePK
        > {
    List<Role> findByPrimaryKey_SpecialistId(
            @Param("specialistId") Long specialistId
    );

    List<Role> findByPrimaryKey_Type(
            @Param("type") TypeOfRole type
    );
}
