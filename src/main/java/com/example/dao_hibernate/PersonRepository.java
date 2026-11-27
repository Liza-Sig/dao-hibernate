package com.example.dao_hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonRepository  extends JpaRepository<Person, PersonId> {
    @Query("Select p from Person p where p.cityOfLiving = :city")
    List<Person> findByCityOfLiving(String city);
    @Query("Select p from Person p where p.age < :age Order by p.age asc")
    List<Person> findByAgeLessThanOrderByAgeAsc(Integer age);
    @Query("Select p from Person p where p.name = :name and p.surname = :surname")
    Optional<Person> findByNameAndSurname(
            @Param("name") String name,
            @Param("surname") String surname);

}

