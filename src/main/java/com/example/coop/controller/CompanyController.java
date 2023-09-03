package com.example.coop.controller;

import com.example.coop.model.CompanyModel;
import com.example.coop.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping
    public List<CompanyModel> getCompany(){return companyRepository.findAll();}

    @PostMapping
    public CompanyModel addCompany(@RequestBody CompanyModel companyModel){
        return companyRepository.save(companyModel);
    }
}
