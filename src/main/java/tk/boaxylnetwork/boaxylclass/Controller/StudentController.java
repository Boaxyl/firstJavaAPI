package tk.boaxylnetwork.boaxylclass.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.boaxylnetwork.boaxylclass.Models.Student;
import tk.boaxylnetwork.boaxylclass.Service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/home")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudentData(){

        return studentService.getAllRegisteredStudent();
    }
    @PostMapping
    public Student registerAStudent(@RequestBody Student student)
    {
        System.out.println(student);
        return studentService.saveAStudent(student);
    }
}
