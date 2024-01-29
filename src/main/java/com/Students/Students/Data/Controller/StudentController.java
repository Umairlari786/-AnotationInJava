package com.Students.Students.Data.Controller;


import com.Students.Students.Data.Model.StudentModel;
import com.Students.Students.Data.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired

    private StudentService serv;
    private Object StudentModel;


    @PostMapping("/Register")
    public ResponseEntity<StudentModel> addStudent(@RequestBody StudentModel student)
    {
        return new ResponseEntity<StudentModel>(serv.PostStudent(student),HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<StudentModel>> getStudent()
    {
        return new ResponseEntity<List<StudentModel>>(serv.getAll(),HttpStatus.OK);
    }


}
