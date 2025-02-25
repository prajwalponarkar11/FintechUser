package com.wipro.day3.repository;

import com.wipro.day3.entity.Account;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
//    @Query("SELECT a FROM Account a LEFT JOIN FETCH a.saving WHERE a.accNumber = :accNumber")
//    Account findByAccNumber(@Param("accNumber") Long accNumber);

    Account findByAccNumber(Long accNumber);
}
