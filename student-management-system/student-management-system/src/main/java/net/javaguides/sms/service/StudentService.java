package net.javaguides.sms.service;

import net.javaguides.sms.dto.StudentDto;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
