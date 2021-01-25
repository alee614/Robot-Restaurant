import java.util.ArrayList;

public class Customer {
	public String customer;
	public ArrayList<FoodItem> check;
	
	public Customer(String customer) {
		this.customer = customer;
		this.check = new ArrayList<FoodItem>();
	}
	
	// adds order to customer's check
	public void order(FoodItem food) {
		this.check.add(food);
		System.out.println("ordered " + food.name);
	}
	
	// find the total cost of the customer's check for all food that HAS BEEN delievered
	public double totalCost() {
		double cost = 0;
		for (int i = 0; i < this.check.size(); i++) {
			if (this.check.get(i).delievered) {
				cost = cost + this.check.get(i).price;
			}
		}
		return cost;
	}
	
	// prints out the name of the customer and then the each food item and it's price
	public void printCheck() {
		System.out.println(this.customer);
		for (int i = 0; i < this.check.size(); i++) {
			System.out.println(this.check.get(i).name + " | $" + this.check.get(i).price);
		}
		System.out.println(totalCost());
	}
	
	// once the robot has delivered the food from the chef to the customer, this is added
	public void delieveredToCustomer(FoodItem food) {
		if (this.check.contains(food)) {
//			System.out.println(this.check.get(this.check.indexOf(food)).delievered);
			this.check.get(this.check.indexOf(food)).delievered = true;
//			System.out.println(food.delievered);
			
		}
		else {
			System.out.println("error, the customer did not order " + food.name);
		}
	}

}
