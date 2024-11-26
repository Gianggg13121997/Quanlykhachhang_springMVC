package com.example.ontap.repository;

import com.example.ontap.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
