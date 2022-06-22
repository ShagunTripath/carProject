package car_delearship;

public class Dealership {
	
	public static void main(String []args)
	{
		Vehicle v1=new Vehicle();
		v1.setModelno(1);
		v1.setPrice(12500.00);
		
		Employee e1=new Employee("Chandu",101);
		Customer c1=new Customer("Tom","ajfjdt",5000.00);
		
		e1.handleCustomer(v1, c1, true);
		
		
		
		c1.purchaseCar(v1, e1, true);
		
		Vehicle car=new Vehicle();
		car.setModelno(2);
		car.setPrice(13300.00);
		
		boolean value=car.equals(v1);
		System.out.println(value);
		System.out.println(car.toString());
	}

}
