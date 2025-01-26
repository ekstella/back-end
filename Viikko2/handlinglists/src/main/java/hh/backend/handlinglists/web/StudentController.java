package hh.backend.handlinglists.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.backend.handlinglists.domain.Student;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String getStudents(Model model) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));
        model.addAttribute("students", students);
        return "studentlist";
    }
}
