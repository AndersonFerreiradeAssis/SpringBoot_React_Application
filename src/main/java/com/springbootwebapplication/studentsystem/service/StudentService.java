package com.springbootwebapplication.studentsystem.service;


import com.springbootwebapplication.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
