package kodlamaio.javahrms.business.abstracts;

import java.util.List;
import kodlamaio.javahrms.core.utilities.results.DataResult;
import kodlamaio.javahrms.core.utilities.results.Result;
import kodlamaio.javahrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>>getAll();
	Result add(Employer employer);
	
}
