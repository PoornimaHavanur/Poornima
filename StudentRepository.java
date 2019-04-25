package com.javainuse.data;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model1.Student;
public interface StudentRepository extends JpaRepository<Student
, Long> {

}



