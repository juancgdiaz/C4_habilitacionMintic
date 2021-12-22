package com.usa.c4_habilitacion;

import com.usa.c4_habilitacion.repository.crudrepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C4_habilitacionApplication implements CommandLineRunner {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(C4_habilitacionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    productCrudRepository.deleteAll();
    }
}
