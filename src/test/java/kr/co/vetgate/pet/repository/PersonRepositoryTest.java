package kr.co.vetgate.pet.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.vetgate.pet.domain.Person;

class PersonRepositoryTest {
	@Autowired
	private PersonRepository personRepository;
	
//	@Test
//	void crud() {
//		Person person = new Person();
//		
//		person.setName("ggybbo");
//		person.setAge(10);
//		
//		personRepository.save(person);
//		
//		System.out.println(personRepository.findAll());
//	}

}
