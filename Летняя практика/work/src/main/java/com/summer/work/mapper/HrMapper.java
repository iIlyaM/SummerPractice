package com.summer.work.mapper;

import com.summer.work.dto.HrDto;
import com.summer.work.entity.HrUsers;

public interface HrMapper {
    HrDto toDto(HrUsers user);
}
