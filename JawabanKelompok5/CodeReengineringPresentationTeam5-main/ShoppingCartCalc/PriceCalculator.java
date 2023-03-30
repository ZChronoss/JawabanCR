import java.util.List;

public class PriceCalculator {
	private double totalPrice;
	private List<Item> items;
	
	public PriceCalculator(List<Item> items) {
		super();
		this.totalPrice = 0;
		this.items = items;
		
		for (Item item : items) {
			totalPrice += item.getPrice();
		}
	}
	
	public void updateTotalPrice(double price) {
		totalPrice += price;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
}
