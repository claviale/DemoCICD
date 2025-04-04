package com.example.demoCICD.api;

import com.example.demoCICD.service.BankService;
import com.example.demoCICD.service.DebitRequestDTO;
import com.example.demoCICD.service.ServiceResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @Autowired
    BankService bankService;

    @PostMapping("/debit")
    public ServiceResponseDTO debit(@RequestBody DebitRequestDTO debitRequestDTO) {
        return bankService.debit(debitRequestDTO.amount);
    }
}
