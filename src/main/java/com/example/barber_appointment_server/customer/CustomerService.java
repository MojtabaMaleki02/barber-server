package com.example.barber_appointment_server.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerByPhoneNumber = customerRepository.findCustomerByPhoneNumber(customer.getPhoneNumber());

        if (customerByPhoneNumber.isPresent()){
            throw new IllegalStateException("Phone number is taken!!");
        }
        customerRepository.save(customer);
    }

    public void deleteCustomer(String customerPhoneNumber) {
       boolean exists = customerRepository.existsById(customerPhoneNumber);
       if (!exists){
           throw new IllegalStateException("Customer with phone number "+customerPhoneNumber+" does not exist!!");
       }

       customerRepository.deleteById(customerPhoneNumber);

    }
}
