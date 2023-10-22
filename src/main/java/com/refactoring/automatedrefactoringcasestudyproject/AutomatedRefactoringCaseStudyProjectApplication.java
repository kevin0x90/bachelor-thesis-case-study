package com.refactoring.automatedrefactoringcasestudyproject;

import com.refactoring.automatedrefactoringcasestudyproject.domain.customer.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

@SpringBootApplication
public class AutomatedRefactoringCaseStudyProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutomatedRefactoringCaseStudyProjectApplication.class, args);

		var beanFactory = context.getBeanFactory();

		beanFactory.registerSingleton(CustomerRepository.class.getCanonicalName(), new CustomerRepository());
	}

}
