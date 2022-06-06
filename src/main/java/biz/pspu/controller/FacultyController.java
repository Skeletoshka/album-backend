package biz.pspu.controller;

import biz.pspu.model.Faculty;
import biz.pspu.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping(value = "/getlist")
    @CrossOrigin
    public List<Faculty> getList(){
        return facultyService.getAll();
    }

    @PostMapping(value = "/get")
    @CrossOrigin
    public Faculty get(@RequestBody String id){
        return facultyService.get(Integer.parseInt(id));
    }

    @PostMapping(value = "/save")
    @CrossOrigin
    public Faculty save(@RequestBody Faculty faculty){
        facultyService.save(faculty);
        return faculty;
    }

    @PostMapping(value = "/delete")
    @CrossOrigin
    public void delete(@RequestBody String id){
        facultyService.delete(Integer.parseInt(id));
    }
}
