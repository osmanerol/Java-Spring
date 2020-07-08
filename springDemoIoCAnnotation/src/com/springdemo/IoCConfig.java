package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springDemo")
@PropertySource("classpath:values.properties")
public class IoCConfig {
	
	@Bean
	public ICustomerDal database() {
		return  new MssqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(this.database());
	}

}