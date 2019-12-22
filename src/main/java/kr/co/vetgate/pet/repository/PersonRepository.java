package kr.co.vetgate.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.vetgate.pet.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
