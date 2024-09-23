package kodlamaio.javahrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_titles")
public class JobTitle {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "titles")
	private String titles;
	
	public JobTitle() {}
	
	public JobTitle(int id, String titles) {
		this.id = id;
		this.titles = titles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}
	
	
	
}
