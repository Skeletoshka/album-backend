package biz.pspu.controller;

import biz.pspu.dto.FileNameDTO;
import biz.pspu.service.EMSService;
import biz.pspu.service.StudentService;
import biz.pspu.view.StudentView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
    @Autowired
    private EMSService emsService;

    @PostMapping ("/getlist")
    @CrossOrigin
    public List<StudentView> getList(@RequestBody String facultyId){
        return studentService.getAll(Integer.parseInt(facultyId));
    }

    @PostMapping("/get")
    @CrossOrigin
    public StudentView get(@RequestBody String id){
        return studentService.get(Integer.parseInt(id));
    }

    @PostMapping("/save")
    @CrossOrigin
    public StudentView save(@RequestBody StudentView view){
        studentService.save(view);
        return view;
    }

    @PostMapping("/delete")
    @CrossOrigin
    public void delete(@RequestBody String id){
        studentService.delete(Integer.parseInt(id));
    }

    //TODO реализовать передачу фото

    @PostMapping("/upload")
    @CrossOrigin
    public FileNameDTO uploadFile (@RequestParam MultipartFile file) {
        FileNameDTO dto = new FileNameDTO();
        dto.setFileName(emsService.upload(file));
        logger.info(String.format("Имя файла '%s' загружено успешно.", file.getOriginalFilename()));
        return dto;
    }
}
