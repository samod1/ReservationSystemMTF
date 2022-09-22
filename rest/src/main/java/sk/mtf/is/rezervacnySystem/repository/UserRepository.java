package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.repository.CrudRepository;
import sk.mtf.is.rezervacnySystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
