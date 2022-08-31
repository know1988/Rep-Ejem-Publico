package com.ingenieriacreactiva.scrum.controller;

import com.ingenieriacreactiva.scrum.entity.Employee;
import com.ingenieriacreactiva.scrum.entity.Enterprise;
import com.ingenieriacreactiva.scrum.entity.Profile;
import com.ingenieriacreactiva.scrum.entity.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    private Profile profile;
    private Employee employee;
    private Transaction transaction;
    private Enterprise enterprise;

    public Rest(Profile profile, Employee employee, Transaction transaction, Enterprise enterprise) {
        this.profile = profile;
        this.employee = employee;
        this.transaction = transaction;
        this.enterprise = enterprise;
    }

    @GetMapping("/enterprise")
    public String generarEnterprise(){
        enterprise.setAddress("Carrera 43A #1Asur-29 of 702");
        return enterprise.getAddress();
    }

    @GetMapping("/")
    public String pruebaspringboot(){
        return "Esta es la primera prueba con Spring Boot";
    }

    @GetMapping("/about")
    public String presentacion(){
        return "Hola! Me llamo Juan Diego Cano :)";
    }

}