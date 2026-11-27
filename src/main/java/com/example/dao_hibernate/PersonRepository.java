package com.example.dao_hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository  extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);
    List<Person> findByAgeLessThanOrderByAgeAsc(Integer age);
    Optional<Person> findByNameAndSurname(String name, String surname);

}

