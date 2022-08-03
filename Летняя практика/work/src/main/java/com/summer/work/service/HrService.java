package com.summer.work.service;

import com.summer.work.dto.HrDto;
import com.summer.work.entity.HrUsers;
import com.summer.work.mapper.HrMapperImpl;
import com.summer.work.repository.HrRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HrService {

    private final HrRepository repository;
    private final HrMapperImpl mapper = new HrMapperImpl();

    public HrService(HrRepository repository) {
        this.repository = repository;
    }

    public List<HrDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public void saveNewHr(HrUsers user) {
        System.out.println(user);
        System.out.println(user.getId());
        repository.save(user);
    }

    public HrUsers findByIndex(Integer id) {
        return repository.findAll()
                .stream().filter(com -> com.getId()
                        .equals(id)).toList().get(0);
    }

    public HrUsers getUser(Integer id) {
        //return mapper.toDto(findByIndex(id));
        return findByIndex(id);
    }

    public List<HrDto> getAllCompanyHrs(String name) {
        return repository.findAll().stream()
                .filter(emails -> emails.getCompany().getCompanyName().equals(name))
                .map(mapper::toDto).toList();
    }
}
