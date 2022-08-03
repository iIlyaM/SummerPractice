package com.summer.work.mapper;

import com.summer.work.dto.HrEmailDto;
import com.summer.work.entity.HrEmails;

public interface HrEmailsMapper {
    HrEmailDto toDto(HrEmails email);

}
