package com.zay.fithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan(basePackages = "com.zay.fithub")
@EnableMongoRepositories(basePackages = "com.zay.fithub.Repositories")
@EntityScan("com.zay.fithub.Entities")
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class FithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(FithubApplication.class, args);
	}

}
