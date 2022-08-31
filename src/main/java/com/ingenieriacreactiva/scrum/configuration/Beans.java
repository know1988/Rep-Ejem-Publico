package com.ingenieriacreactiva.scrum.configuration;

import com.ingenieriacreactiva.scrum.entity.Employee;
import com.ingenieriacreactiva.scrum.entity.Enterprise;
import com.ingenieriacreactiva.scrum.entity.Profile;
import com.ingenieriacreactiva.scrum.entity.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Profile profile() {
        return new Profile();
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Transaction transaction() {
        return new Transaction();
    }

    @Bean
    public Enterprise enterprise() {
        return new Enterprise();
    }

}