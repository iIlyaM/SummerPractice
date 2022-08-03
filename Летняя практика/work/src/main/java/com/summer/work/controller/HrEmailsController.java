package com.summer.work.controller;

import com.summer.work.dto.HrEmailDto;
import com.summer.work.entity.HrEmails;
import com.summer.work.service.HrEmailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HrEmailsController {
    private final HrEmailsService service;

    public HrEmailsController(HrEmailsService service) {
        this.service = service;
    }

    @GetMapping("/emails")
    public List<HrEmailDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/email/new")
    public void save(@RequestBody HrEmails emails) {
        service.saveNewEmail(emails);
    }

    @GetMapping("/email/{id}")
    public HrEmailDto getOne(@PathVariable Integer id) {
        return service.getEmail(id);
    }

    @GetMapping("/emails/{name}")
    public List<HrEmailDto> getCompanyEmails(@PathVariable String name) {
        return service.getAllCompanyEmails(name);
    }
}
