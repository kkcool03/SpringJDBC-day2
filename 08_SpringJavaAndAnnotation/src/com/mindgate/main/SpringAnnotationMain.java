package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

public class SpringAnnotationMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext 
					= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		FinancialYearDetails details 
				= applicationContext.getBean("financialyeardetails", FinancialYearDetails.class);
		details.setYearId(2022);
		details.setYearStartDate(LocalDate.of(2022, 05, 1));
		details.setYearEndDate(LocalDate.of(2023, 03, 31));
		System.out.println(details);
		
		MonthsDetails details2 = 
				applicationContext.getBean("monthsdetaiks", MonthsDetails.class);
		System.out.println(details2);
	}
}
