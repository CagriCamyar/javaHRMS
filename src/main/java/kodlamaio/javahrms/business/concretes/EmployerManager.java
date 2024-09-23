package kodlamaio.javahrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.javahrms.business.abstracts.EmployerService;
import kodlamaio.javahrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.javahrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	
	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

}
