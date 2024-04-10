package Accelerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Accelerator.DBEntity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // You can define custom query methods here if needed.
}

