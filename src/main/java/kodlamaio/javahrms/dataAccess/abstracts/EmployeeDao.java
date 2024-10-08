package kodlamaio.javahrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.javahrms.entities.concretes.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
