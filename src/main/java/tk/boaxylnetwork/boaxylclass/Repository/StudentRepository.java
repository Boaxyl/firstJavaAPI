package tk.boaxylnetwork.boaxylclass.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import tk.boaxylnetwork.boaxylclass.Models.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{




}
