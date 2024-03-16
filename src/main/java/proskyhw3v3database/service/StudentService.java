package proskyhw3v3database.service;

import proskyhw3v3database.entities.Student;

import java.util.Collection;

public interface StudentService {

    public Student getStudentById(long id);
    public Student createStudent(String name, int age);
    public void updateStudent(String name, int age);
    public void deleteStudent(long id);

}
