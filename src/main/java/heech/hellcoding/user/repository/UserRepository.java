package heech.hellcoding.user.repository;

import heech.hellcoding.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    //List<User> findAll();
}
