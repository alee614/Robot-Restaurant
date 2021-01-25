
public class RoboRestaurantTester {
	public static void main(String[] args) {
		FoodItem hamburger = new FoodItem("Hamburger", 3.77);
		FoodItem soup = new FoodItem("Soup", 2.00);
		FoodItem boba = new FoodItem("Boba", 4.20);
		FoodItem lobsterroll = new FoodItem("Lobster Roll", 10.99);
		FoodItem friedchicken = new FoodItem("Korean Fried Chicken", 1.99);
		
		Customer Amy = new Customer("Amy");
		Amy.order(friedchicken);
		Amy.order(boba);
		Amy.order(soup);
		
		Amy.delieveredToCustomer(boba);
		Amy.delieveredToCustomer(soup);
		
		Amy.printCheck();
		
		
		Customer Tammie = new Customer("Tammie");
		Tammie.order(boba);
		Tammie.order(lobsterroll);
		
		Tammie.delieveredToCustomer(boba);
		Tammie.delieveredToCustomer(lobsterroll);
		
		Tammie.printCheck();
		
		
	}

}
