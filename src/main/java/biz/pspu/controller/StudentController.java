package biz.pspu.controller;

import biz.pspu.service.StudentService;
import biz.pspu.view.StudentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping ("/getlist")
    public List<StudentView> getList(@RequestBody String facultyId){
        return studentService.getAll(Integer.parseInt(facultyId));
    }

    @PostMapping("/get")
    public StudentView get(@RequestBody String id){
        return studentService.get(Integer.parseInt(id));
    }

    @PostMapping("/save")
    public StudentView save(@RequestBody StudentView view){
        studentService.save(view);
        return view;
    }

    @PostMapping("/delete")
    public void delete(@RequestBody String id){
        studentService.delete(Integer.parseInt(id));
    }
}
