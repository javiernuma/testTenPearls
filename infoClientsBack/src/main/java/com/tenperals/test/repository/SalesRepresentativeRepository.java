package com.tenperals.test.repository;

import com.tenperals.test.model.SalesRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepresentativeRepository extends JpaRepository<SalesRepresentative, Long> {
}
