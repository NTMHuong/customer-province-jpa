package com.codegym.repository;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Optional<Province> province);
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
    Page<Customer> findAllByFirstNameStartsWith(String firstName, Pageable pageable);
}
