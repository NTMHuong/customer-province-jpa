package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<Customer> findAll(Pageable pageable);

    Iterable<Customer> findAllByProvince(Optional<Province> province);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
