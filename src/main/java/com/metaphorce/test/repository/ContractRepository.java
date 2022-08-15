package com.metaphorce.test.repository;

import com.metaphorce.test.models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
