package com.rm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rm.entity.StudentEntity;
import com.rm.repository.StudentRepository;

@SpringBootApplication
public class CurdOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CurdOperationApplication.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);
		StudentEntity student = new StudentEntity("ABC124", "Ramu", "Ricky", "ram@gmail.com", 8455012523L);
		repo.save(student);
		System.out.println("Done");
	}

}
