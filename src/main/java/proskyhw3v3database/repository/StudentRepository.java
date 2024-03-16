package proskyhw3v3database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proskyhw3v3database.entities.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> getByAge(int age);
    List<Student> findByAgeBetween(int minAge, int maxAge);
}
