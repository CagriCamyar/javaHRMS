package kodlamaio.javahrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

	@Id
	@Column(name = "id")
	private int id; 
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_identity")
	private String nationalityIdentity;
	
	public Candidate() {}
	
	public Candidate(int id, String firstName, String lastName, String nationalityIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
	
}
