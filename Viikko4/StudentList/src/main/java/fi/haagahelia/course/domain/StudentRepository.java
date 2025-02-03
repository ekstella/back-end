package fi.haagahelia.course.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {


    // studentrepository perii CrudRepository-rajapinnasta findAll(), 
    // findById(), save(), deleteById()
    List<Student> findByLastName(String lastName);
    
}