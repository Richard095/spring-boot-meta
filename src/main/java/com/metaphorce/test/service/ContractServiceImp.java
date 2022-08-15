package com.metaphorce.test.service;

import com.metaphorce.test.models.Contract;
import com.metaphorce.test.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImp implements ContractService{

    @Autowired
    ContractRepository contractRepository;

    @Override
    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }
}
