package kodlamaio.javahrms.business.abstracts;

import java.util.List;
import kodlamaio.javahrms.core.utilities.results.DataResult;
import kodlamaio.javahrms.core.utilities.results.Result;
import kodlamaio.javahrms.entities.concretes.Candidate;

public interface CandidateService {

	DataResult<List<Candidate>>	getAll();
	Result add(Candidate candidate);
	
}
