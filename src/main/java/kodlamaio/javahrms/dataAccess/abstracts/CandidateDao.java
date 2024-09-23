package kodlamaio.javahrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.javahrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
