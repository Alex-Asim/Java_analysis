package net.javaguides.sms.service.impl;

//import net.javaguides.sms.StudentDto;

import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.mapper.StudentMapper;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentDtos;
    }
}
