package kata.preproj.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import kata.preproj.Spring.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
