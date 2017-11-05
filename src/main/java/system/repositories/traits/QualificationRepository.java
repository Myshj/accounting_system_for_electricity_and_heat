package system.repositories.traits;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.traits.qualification.Qualification;
import system.entities.traits.qualification.QualificationPK;
import system.entities.types.TypeOfQualification;

import java.util.List;

@RepositoryRestResource
public interface QualificationRepository
        extends PagingAndSortingRepository<
        Qualification,
        QualificationPK
        > {

    List<Qualification> findByPrimaryKey_SpecialistId(
            @Param("specialistId") Long specialistId
    );

    List<Qualification> findByPrimaryKey_Type(
            @Param("type") TypeOfQualification type
    );
}
