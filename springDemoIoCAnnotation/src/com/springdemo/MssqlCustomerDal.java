package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

/*
import org.springframework.stereotype.Component;

// annotation
@Component("database")
*/
public class MssqlCustomerDal implements ICustomerDal {
	
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("ConnectionString: "+this.connectionString);
		System.out.println("Mssql veritabanýna eklendi");
	}

}
