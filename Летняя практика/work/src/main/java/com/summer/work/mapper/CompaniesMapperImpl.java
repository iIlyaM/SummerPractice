package com.summer.work.mapper;

import com.summer.work.dto.CompaniesDto;
import com.summer.work.entity.Companies;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CompaniesMapperImpl  implements CompaniesMapper{

    @Override
    public CompaniesDto toDto(Companies company) {
        if (company == null) {
            return null;
        }

        CompaniesDto companiesDto = new CompaniesDto();

        companiesDto.setCompanyName(company.getCompanyName());
        companiesDto.setRating(company.getRating());

        return companiesDto;
    }
    @Override
    public Companies toEntity(CompaniesDto dto) {
        if (dto == null) {
            return null;
        }

        Companies company = new Companies();

        company.setCompanyName(dto.getCompanyName());
        company.setRating(dto.getRating());

        return company;
    }
}
