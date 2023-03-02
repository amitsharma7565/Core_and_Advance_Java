package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy="emp")
	private List<Project> pr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getPr() {
		return pr;
	}
	public void setPr(List<Project> pr) {
		this.pr = pr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pr=" + pr + "]";
	} 
	
	
}
