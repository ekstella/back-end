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
        students.add(new Student("Cole", "Kate"));
        students.add(new Student("Brown", "Dan"));
        students.add(new Student("Mars", "Mike"));
        model.addAttribute("students", students);
        return "studentlist";
    }
}
