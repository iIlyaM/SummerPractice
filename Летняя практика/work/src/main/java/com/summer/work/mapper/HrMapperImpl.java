package com.summer.work.mapper;

import com.summer.work.dto.HrDto;
import com.summer.work.entity.HrUsers;
import org.springframework.stereotype.Component;

@Component
public class HrMapperImpl implements HrMapper{
    @Override
    public HrDto toDto(HrUsers user) {
        if (user == null) {
            return null;
        }

        HrDto dto = new HrDto();

        dto.setName(user.getHrName());

        return dto;
    }
}
