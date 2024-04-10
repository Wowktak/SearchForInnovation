package Accelerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import Accelerator.DBEntity.Customer_record;

import java.util.List;

@Repository
public interface CustomerRecordRepository extends JpaRepository<Customer_record, Long> {


    @Query(value = "SELECT user_id FROM customer_record c WHERE c.user_id = :userId ",nativeQuery = true)
    List<Object[]> findByUserId(@Param("userId") Long userId);

}

