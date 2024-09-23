package kodlamaio.javahrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.javahrms.business.abstracts.UserService;
import kodlamaio.javahrms.dataAccess.abstracts.UserDao;
import kodlamaio.javahrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

}
