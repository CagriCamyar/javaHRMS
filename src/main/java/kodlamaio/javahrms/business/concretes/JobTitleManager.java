package kodlamaio.javahrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.javahrms.business.abstracts.JobTitleService;
import kodlamaio.javahrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.javahrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll();
	}

}
