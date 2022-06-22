package car_delearship;

public class Employee {
	String ename;
	int eid;
	
	public Employee(String ename,int eid)
	{
		this.ename=ename;
		this.eid=eid;
	}
	
	
	public void handleCustomer(Vehicle v, Customer cust ,boolean finance)
	{
		

		if(finance==true)
		{
			double financeAmount=v.getPrice()-cust.cash;
			 runCreditHistory(cust,financeAmount);
			 
		}
		else if(v.getPrice()<=cust.cash)
		{
			
			processTransaction(cust,v);
				
		}
		else
			System.out.println("bring more money to purchase......");
		
	}
	
	public void runCreditHistory(Customer cust,double financeAmount)
	{
		System.out.println("finance amount is"+financeAmount);
	}
	
	public void processTransaction(Customer cust,Vehicle v)
	{
		double Moneyleft=cust.cash-v.getPrice();
		System.out.println("You have purchased car of rupees:"+v.getPrice()+"and remaning balance is"+Moneyleft);	
	}
}
