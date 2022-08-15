package com.metaphorce.test.controllers;

import com.metaphorce.test.models.Contract;
import com.metaphorce.test.models.User;
import com.metaphorce.test.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ContractController {
    @Autowired
    ContractService contractService;

    @PostMapping("/contracts")

    public Contract saveContract(@RequestBody Contract contract){
       return this.contractService.createContract(contract);
    }

}
