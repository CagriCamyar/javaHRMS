package kodlamaio.javahrms.business.abstracts;

import java.util.List;
import kodlamaio.javahrms.entities.concretes.JobTitle;

public interface JobTitleService {

	List<JobTitle> getAll();
	
}
