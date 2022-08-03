package com.summer.work.controller;

import com.summer.work.dto.CompaniesDto;
import com.summer.work.service.CompaniesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompaniesController {

    private final CompaniesService service;

    public CompaniesController(CompaniesService service) {
        this.service = service;
    }

    @GetMapping("/companies")
    public List<CompaniesDto> getAll() {
        return service.getAllCompanies();
    }

    @PostMapping("/company/new")
    public void save(@RequestBody CompaniesDto dto) {
        service.saveNewCompanies(dto);
    }

    @GetMapping("/company/{id}")
    public CompaniesDto getOne(@PathVariable Integer id) {
        return service.getCompany(id);
    }
}
