package com.spring.batch.file.upload.api.repository;
import com.spring.batch.file.upload.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
