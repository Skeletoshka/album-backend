package biz.pspu.service;

import biz.pspu.model.Faculty;
import biz.pspu.model.Student;
import biz.pspu.repository.FacultyRepository;
import biz.pspu.repository.StudentRepository;
import biz.pspu.view.StudentView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private FacultyRepository facultyRepository;

    public List<StudentView> getAll(Integer facultyId){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(student -> {
            if(student.getFacultyId().equals(facultyId)){
                students.add(student);
            }
        });
        List<StudentView> views = new ArrayList<>();
        List<Faculty> faculties = facultyRepository.findAll();
        Map<Integer, String> facultyName = new HashMap();
        faculties.forEach(faculty -> {
            facultyName.put(faculty.getFacultyId(), faculty.getFacultyName());
        });
        students.forEach(student -> {
            StudentView studentView = new StudentView();
            BeanUtils.copyProperties(student, studentView);
            studentView.setFacultyName(facultyName.get(studentView.getFacultyId()));
            views.add(studentView);
        });
        return views;
    }

    public StudentView get(Integer id){
        Student student = studentRepository.getOne(id);
        StudentView view = new StudentView();
        BeanUtils.copyProperties(student, view);
        view.setFacultyName(facultyRepository.getOne(view.getFacultyId()).getFacultyName());
        return view;
    }

    public void save(StudentView studentView){
        Student student = new Student();
        BeanUtils.copyProperties(studentView, student);
        studentRepository.save(student);
    }

    public void delete(Integer id){
        studentRepository.deleteById(id);
    }
}
