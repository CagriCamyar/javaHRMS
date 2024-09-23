package kodlamaio.javahrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.javahrms.business.abstracts.EmployeeService;
import kodlamaio.javahrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.javahrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

}
