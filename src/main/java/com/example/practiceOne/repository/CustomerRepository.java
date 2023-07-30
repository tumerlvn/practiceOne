package com.example.practiceOne.repository;

import com.example.practiceOne.entities.customer.Customer;
import com.example.practiceOne.service.CustomerService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByUsername(String username);
    Customer findByEmail(String email);
    Customer findByPassportNumber(String passportNumber);

}
