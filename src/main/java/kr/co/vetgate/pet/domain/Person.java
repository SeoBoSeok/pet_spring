package kr.co.vetgate.pet.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Long Id;
	
	private String name;
	
	private int age;


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}
}
