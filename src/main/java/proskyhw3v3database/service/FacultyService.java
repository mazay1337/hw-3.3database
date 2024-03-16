package proskyhw3v3database.service;


import proskyhw3v3database.entities.Faculty;

import java.util.Collection;

public interface FacultyService {
    public Faculty createFaculty(String name, String color);
    public Faculty getFacultyById(long id);
    public Faculty updateFaculty(Long id, String name, String color);
    public void deleteFaculty(long id);


}
