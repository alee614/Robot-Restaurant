public class FoodItem{
	public String name;
	public double price;
	public boolean delievered;
	
	public FoodItem() {
		
	}
	
	public FoodItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.delievered = false;
		System.out.println("new food item: " + name + " " + price);
	}
	
	public String getItemName() {
		return this.name;
	}
	
	public double getItemPrice() {
		return this.price;
	}
	
	
}