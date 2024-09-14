package com.example.barber_appointment_server.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Query("SELECT c FROM Customer c WHERE c.phoneNumber = :phoneNumber")
    Optional<Customer> findCustomerByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
