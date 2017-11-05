package system.repositories;

import org.springframework.data.repository.CrudRepository;
import system.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
