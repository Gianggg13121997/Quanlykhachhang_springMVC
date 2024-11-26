package com.example.ontap.service;

import com.example.ontap.model.Customer;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    void save(T t);

   Optional<T> findById(Long id);

    void remove(Long id);
}