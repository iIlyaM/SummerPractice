package com.summer.work.mapper;

import com.summer.work.dto.CompaniesDto;
import com.summer.work.entity.Companies;

public interface CompaniesMapper {
    CompaniesDto toDto(Companies company);

    Companies toEntity(CompaniesDto dto);
}
