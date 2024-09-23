package kodlamaio.javahrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer {

	@Id
	@Column(name = "id")
	private int id; 
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "web_address")
	private String webAddress;
	
	public Employer() {}
	
	public Employer(int id, String companyName, String phoneNumber, String webAddress) {
		this.id = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webAddress = webAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
	
	
}
