package Accelerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Accelerator.DBEntity.RecordRole;

@Repository
public interface HotelRoleRepository extends JpaRepository<RecordRole, Long> {
    // You can define custom query methods here if needed.
}
