package car_delearship;

public class Customer {
	
	String name;
	String add;
	double cash;
	
	public Customer(String name,String add,double cash){
		this.name=name;
		this.add=add;
		this.cash=cash;	
	}
	
	public void purchaseCar(Vehicle v, Employee e,boolean finance){
		e.handleCustomer(v, this, finance);
		
	}

	

}
