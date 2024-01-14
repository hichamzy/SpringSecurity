package com.xproce.Repositories;

import com.xproce.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


    List<Customer> findByEmail(String username);
}
