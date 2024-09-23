package kodlamaio.javahrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.javahrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
