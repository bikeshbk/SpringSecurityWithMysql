package com.security.mysql.springSecurityMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringSecurityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMysqlApplication.class, args);
	}
}
