package com.example.barber_appointment_server.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
      return args -> {
          Customer Mojtaba = new Customer(
                  "+989364400814",
                  "Mojtaba Maleki",
                  "Hair Cut",
                  LocalDate.of(2024, 9,16),
                  "15:00"
          );

          Customer Pouria = new Customer(
                  "+989364400815",
                  "Pouria Afshari",
                  "Hair Cut",
                  LocalDate.of(2024, 9,16),
                  "15:00"
          );

          repository.saveAll(List.of(Mojtaba, Pouria));
      };
    }
}
