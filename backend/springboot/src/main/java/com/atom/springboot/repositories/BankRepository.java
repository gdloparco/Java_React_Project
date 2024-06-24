package com.atom.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atom.springboot.entities.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
    // JpaRepository provides CRUD operations
    // Bank is the entity type and Long is the type of its primary key

    // This method signature allows finding a Bank entity by its bankname
    Bank findByBankname(String bankname);
}
