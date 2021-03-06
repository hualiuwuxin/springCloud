package com.smt;

import java.util.HashSet;
import java.util.Set;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.smt.dao")
public class ServerARunner {

	public static void main(String[] args) { 
		SpringApplication application = new SpringApplication();
		Set<Object> set = new HashSet<>();
		set.add(ServerARunner.class ); 
		application.setSources(set);
		ConfigurableApplicationContext context = application.run(args);

	}

}
