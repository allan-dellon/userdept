package com.devsuperior.userdept.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_user")

public class User {
	
	@Id //CP do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementável
	private Long id;
	private String name;
	private String email;
	
	/*associação entre entidades: 1 usuario possui 1 departamento;
	/"Relacionamento Muitos para 1" 
	/ - A CE 
	*/
	
	@ManyToOne
	@JoinColumn(name = "department_id") // O nome da CE do banco
	private Department department;

	public User() {
	}

	public User(Long id, String name, String email, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
}
