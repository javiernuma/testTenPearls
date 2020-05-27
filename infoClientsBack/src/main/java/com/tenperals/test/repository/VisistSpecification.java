package com.tenperals.test.repository;

import com.tenperals.test.model.City;
import com.tenperals.test.model.Visist;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.Predicate;

public class VisistSpecification {

    public static Specification<Visist> hasVisitByCity(Long city){
        return (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (!StringUtils.isEmpty(city)){
                predicates.add(criteriaBuilder.equal(root.get("client").get("city").get("id"), city));
            }
            return  criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
        };
    }
}
