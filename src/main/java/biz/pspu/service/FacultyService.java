package biz.pspu.service;

import biz.pspu.model.Faculty;
import biz.pspu.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    FacultyRepository facultyRepository;

    public List<Faculty> getAll(){
        return facultyRepository.findAll();
    }

    public Faculty get(Integer id){
        return facultyRepository.getOne(id);
    }

    public void save(Faculty faculty){
        facultyRepository.save(faculty);
    }

    public void delete(Integer id){
        facultyRepository.deleteById(id);
    }
}
