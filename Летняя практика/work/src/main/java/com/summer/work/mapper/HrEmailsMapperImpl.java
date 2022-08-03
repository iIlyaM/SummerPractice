package com.summer.work.mapper;

import com.summer.work.dto.HrEmailDto;
import com.summer.work.entity.HrEmails;
import org.springframework.stereotype.Component;

@Component
public class HrEmailsMapperImpl implements HrEmailsMapper{
    @Override
    public HrEmailDto toDto(HrEmails email) {
        if (email == null) {
            return null;
        }

        HrEmailDto dto = new HrEmailDto();

        dto.setEmail(email.getEmail());

        return dto;
    }
}
