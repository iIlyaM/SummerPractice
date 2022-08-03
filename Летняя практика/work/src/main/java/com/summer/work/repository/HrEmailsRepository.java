package com.summer.work.repository;

import com.summer.work.entity.HrEmails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HrEmailsRepository extends CrudRepository<HrEmails,Integer> {
    List<HrEmails> findAll();
}
