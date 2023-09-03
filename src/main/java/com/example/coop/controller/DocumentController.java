package com.example.coop.controller;


import com.example.coop.model.DocumentModel;
import com.example.coop.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping
    public List<DocumentModel> getDate(){
        return documentRepository.findAll();
    }
    @PostMapping
    public DocumentModel addData(@RequestBody DocumentModel documentModel){
        return documentRepository.save(documentModel);
    }
}
