package com.summer.work.repository;

import com.summer.work.entity.HrUsers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HrRepository extends CrudRepository<HrUsers, Integer> {
    List<HrUsers> findAll();
}
