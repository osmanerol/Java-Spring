package springIntro;

public class MssqlCustomerDal implements ICustomerDal {
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("ConnectionString: "+this.connectionString);
		System.out.println("Mssql veritanýna eklendi");
	}

}
