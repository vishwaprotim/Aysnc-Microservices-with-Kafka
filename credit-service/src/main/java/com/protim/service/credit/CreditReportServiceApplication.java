package com.protim.service.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CreditReportServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditReportServiceApplication.class, args);
	}

}
