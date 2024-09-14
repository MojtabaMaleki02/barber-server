package com.example.barber_appointment_server.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Customer {
    @Id
    private String phoneNumber;
    private String name;
    private String service;
    private LocalDate localDate;
    private String hour;


    public Customer() {
    }

    public Customer(String phoneNumber, String name, String service, LocalDate localDate, String hour) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.service = service;
        this.localDate = localDate;
        this.hour = hour;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", localDate=" + localDate +
                ", hour='" + hour + '\'' +
                '}';
    }
}

