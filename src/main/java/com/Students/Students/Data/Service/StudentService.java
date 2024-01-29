package com.Students.Students.Data.Service;

import com.Students.Students.Data.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {

@Autowired
    private ServiceInterface service;

    public StudentModel PostStudent( StudentModel student)
    {
        StudentModel savedStudent = service.save(student);
        return savedStudent;
    }

    public List<StudentModel> getAll()
    {
        return service.findAll();
    }


}
