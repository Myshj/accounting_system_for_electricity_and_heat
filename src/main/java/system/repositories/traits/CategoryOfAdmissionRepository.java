package system.repositories.traits;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import system.entities.traits.category_of_admission.CategoryOfAdmission;
import system.entities.traits.category_of_admission.CategoryOfAdmissionPK;
import system.entities.types.TypeOfCategoryOfAdmission;

import java.util.List;

@RepositoryRestResource(
        collectionResourceRel = "categoriesOfAdmission",
        path = "categoriesOfAdmission"
)
public interface CategoryOfAdmissionRepository
        extends PagingAndSortingRepository<
        CategoryOfAdmission, CategoryOfAdmissionPK
        > {

    List<CategoryOfAdmission> findByPrimaryKey_SpecialistId(
            @Param("specialistId") Long specialistId
    );

    List<CategoryOfAdmission> findByPrimaryKey_Type(
            @Param("type") TypeOfCategoryOfAdmission type
    );
}
