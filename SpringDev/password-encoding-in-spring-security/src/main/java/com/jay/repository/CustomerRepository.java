package com.jay.repository;

import com.jay.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

    CustomerEntity findByEmail(String email);

    @Query("UPDATE CustomerEntity c SET c.failedAttempt = ?1 WHERE c.email = ?2")
    @Modifying
    void updateFailedAttempts(int failAttempts, String email);
}
