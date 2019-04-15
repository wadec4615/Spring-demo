package com.oci.wade.demo.bootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = { "com.oci.wade.demo.bootrest" })
@EnableJpaRepositories(basePackages = "com.oci.wade.demo.bootrest.repositories")
@EnableTransactionManagement
@EntityScan(basePackages = "com.oci.wade.demo.bootrest.entities")
public class SpringBootRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApplication.class, args);
    }

}
