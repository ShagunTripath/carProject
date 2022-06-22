package car_delearship;

public class Vehicle {
	private int Modelno;
	private double Price;
	public int getModelno() {
		return Modelno;
	}
	public void setModelno(int modelno) {
		Modelno = modelno;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Modelno;
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Modelno != other.Modelno)
			return false;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vehicle [Modelno=" + Modelno + ", Price=" + Price + "]";
	}
	
	
	
	

}
