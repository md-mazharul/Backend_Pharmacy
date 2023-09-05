package com.example.Summer_Project.repositoty;

import com.example.Summer_Project.entity.Pharmacy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PharmacyRepositoty extends CrudRepository<Pharmacy, Long> {
}
