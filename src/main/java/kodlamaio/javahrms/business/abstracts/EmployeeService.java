package kodlamaio.javahrms.business.abstracts;

import java.util.List;
import kodlamaio.javahrms.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();

}
