package com.summer.work.controller;

import com.summer.work.dto.HrDto;
import com.summer.work.entity.HrUsers;
import com.summer.work.service.HrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HrController {
    private final HrService service;

    public HrController(HrService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<HrDto> getAll() {
        return service.getAll();
    }

    @PostMapping("/user/nw")
    public void save(@RequestBody HrUsers users) {
        System.out.println(users);
        service.saveNewHr(users);
    }

    @GetMapping("/user/{id}")
    public HrUsers getOne(@PathVariable Integer id) {
        return service.getUser(id);
    }

    @GetMapping("/users/{name}")
    public List<HrDto> getCompanyHrs(@PathVariable String name) {
        return service.getAllCompanyHrs(name);
    }

}
