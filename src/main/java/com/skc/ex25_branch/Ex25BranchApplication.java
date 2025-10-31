package com.skc.ex25_branch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Ex25BranchApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex25BranchApplication.class, args);
		
//		EB연결 전이라면..
		//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
	}

}
