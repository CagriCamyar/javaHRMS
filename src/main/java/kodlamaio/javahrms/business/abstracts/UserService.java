package kodlamaio.javahrms.business.abstracts;

import java.util.List;
import kodlamaio.javahrms.entities.concretes.User;

public interface UserService {

	List<User> getAll();

}
