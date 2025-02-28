package Accelerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Accelerator.DBEntity.DBUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<DBUser, Long> {
    public Optional<DBUser> findByLogin(String login);
    public Optional<DBUser> findByLoginAndPassword(String login, String password);
    void removeByLogin(String login);
    // You can define custom query methods here if needed.

}

