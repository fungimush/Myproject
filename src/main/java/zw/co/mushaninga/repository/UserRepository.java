package zw.co.mushaninga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.mushaninga.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailaddress(String emailaddress);
}