package com.github.levphilippov.inventoryfailover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryFailoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryFailoverApplication.class, args);
    }

}
