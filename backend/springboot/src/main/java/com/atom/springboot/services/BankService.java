package com.atom.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atom.springboot.entities.Bank;
import com.atom.springboot.repositories.BankRepository;
import java.util.Optional;

@Service
public class BankService {
    @Autowired BankRepository bankRepository;

    public BankService(){

    }

    public List<Bank> getBanks(){
        return bankRepository.findAll();
    }


    public Bank saveBank(Bank bank) {
        return bankRepository.save(bank);
    }

    public Bank getBank(String bankname) {
        return bankRepository.findByBankname(bankname);
    }

    public boolean deleteBank(Long id) {
        Optional<Bank> bank = bankRepository.findById(id);
        if (bank.isPresent()) {
            bankRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

