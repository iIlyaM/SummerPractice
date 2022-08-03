package com.summer.work.repository;

import com.summer.work.entity.Companies;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompaniesRepository extends CrudRepository<Companies, Integer> {
    List<Companies> findAll();
}
