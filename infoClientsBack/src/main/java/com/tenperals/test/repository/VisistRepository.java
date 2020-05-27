package com.tenperals.test.repository;

import com.tenperals.test.model.City;
import com.tenperals.test.model.Client;
import com.tenperals.test.model.Visist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisistRepository extends PagingAndSortingRepository<Visist, Long>, JpaSpecificationExecutor<Visist>,  JpaRepository<Visist, Long> {
    List<Visist> findAll();
}
