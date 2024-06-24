package com.atom.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.atom.springboot.entities.Bank;
import com.atom.springboot.services.BankService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {
    
    @Autowired
    BankService bankService;

    @GetMapping("getbanks")
    public List<Bank> getBanks(){
        return bankService.getBanks();
    }

    @PostMapping("addbank")
    public Bank SaveBank(@RequestBody Bank bank){
        return bankService.saveBank(bank);
    }

    @GetMapping("getbank")
    public Bank getBank(String bankname){
        return bankService.getBank(bankname);
    }

    @DeleteMapping("deletebank/{id}")
    public ResponseEntity<String> deleteBank(@PathVariable Long id) {
        boolean isRemoved = bankService.deleteBank(id);
        if (!isRemoved) {
            return new ResponseEntity<>("Bank not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Bank deleted successfully", HttpStatus.OK);
    }
 }