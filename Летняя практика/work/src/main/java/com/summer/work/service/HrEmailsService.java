package com.summer.work.service;

import com.summer.work.dto.HrEmailDto;
import com.summer.work.entity.HrEmails;
import com.summer.work.mapper.HrEmailsMapperImpl;
import com.summer.work.repository.HrEmailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HrEmailsService {
    private final HrEmailsRepository repository;
    private final HrEmailsMapperImpl mapper = new HrEmailsMapperImpl();

    public HrEmailsService(HrEmailsRepository repository) {
        this.repository = repository;
    }

    public List<HrEmailDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public void saveNewEmail(HrEmails email) {
        repository.save(email);
    }

    public HrEmails findByIndex(Integer id) {
        return repository.findAll()
                .stream().filter(com -> com.getId()
                        .equals(id)).toList().get(0);
    }

    public HrEmailDto getEmail(Integer id) {
        return mapper.toDto(findByIndex(id));
    }

    public List<HrEmailDto> getAllCompanyEmails(String name) {
        return repository.findAll().stream()
                .filter(emails -> emails.getCompany().getCompanyName().equals(name))
                .map(mapper::toDto).toList();
    }
}
