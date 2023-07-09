package com.pru.crudRapid.controller;

import com.pru.crudRapid.entity.Student;
import com.pru.crudRapid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private  StudentService studentService;

    @GetMapping
    public List<Student>getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{studenId}")
    public void delete(@PathVariable("studenId") Long studenId){
        studentService.delete(studenId);
    }



}
