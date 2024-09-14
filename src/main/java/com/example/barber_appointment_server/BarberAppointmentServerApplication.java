package com.example.barber_appointment_server;

import com.example.barber_appointment_server.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class BarberAppointmentServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(BarberAppointmentServerApplication.class, args);
	}
}
