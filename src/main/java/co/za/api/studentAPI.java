package co.za.api;

import co.za.domain.Student;
import co.za.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentAPI {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/student/{studentNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudent(@PathVariable(value ="studentNumber") String studentNumber){
//        StudentService studentService = new StudentService();
        List<Student> student =  studentService.getStudentByStudentNumber(studentNumber);
        System.out.println("");
        return student;
    }
}
