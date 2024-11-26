package com.example.ontap.service.impl;

import com.example.ontap.model.Customer;
import com.example.ontap.repository.ICustomerRepository;
import com.example.ontap.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public Optional<Customer> findById(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if(!customer.isPresent()){
            throw new Exception("Customer not found");
        }
        return customerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);

    }
}
