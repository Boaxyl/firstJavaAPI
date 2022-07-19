package tk.boaxylnetwork.boaxylclass.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tk.boaxylnetwork.boaxylclass.Models.Student;
import tk.boaxylnetwork.boaxylclass.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> getAllRegisteredStudent(){
        return repository.findAll();
    }
    public Student saveAStudent(@RequestBody Student student){
        return repository.saveAndFlush(student);
    }


}
