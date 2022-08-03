package com.summer.work.service;

import com.summer.work.dto.CompaniesDto;
import com.summer.work.entity.Companies;
import com.summer.work.mapper.CompaniesMapperImpl;
import com.summer.work.repository.CompaniesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompaniesService {
    private final CompaniesRepository repository;
    private final CompaniesMapperImpl mapper = new CompaniesMapperImpl();

    public CompaniesService(CompaniesRepository repository) {
        this.repository = repository;
    }

    public List<CompaniesDto> getAllCompanies() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public Companies findByIndex(Integer id) {
        return repository.findAll()
                .stream().filter(com -> com.getId()
                        .equals(id)).toList().get(0);
    }

    public void saveNewCompanies(CompaniesDto dto) {
        var company = mapper.toEntity(dto);
        repository.save(company);
    }

    public CompaniesDto getCompany(Integer id) {
        return mapper.toDto(findByIndex(id));
    }
}
