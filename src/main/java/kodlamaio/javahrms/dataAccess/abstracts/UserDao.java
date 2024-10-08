package kodlamaio.javahrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kodlamaio.javahrms.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
