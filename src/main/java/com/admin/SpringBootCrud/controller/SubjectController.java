package com.admin.SpringBootCrud.controller;

import com.admin.SpringBootCrud.bean.Subject;
import com.admin.SpringBootCrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
    public void updateSubject(@PathVariable String id,  @RequestBody Subject subject){
        subjectService.updateSubject(id,subject);
    }

    public void deleteSubject(@PathVariable String id){
        subjectService.deleteSubject(id);
    }

}
