public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(item::getPrice).sum();
    }

    public void printItems() {
        
        items.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Product 1", 10);
        Item item2 = new Item("Product 2", 20);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.printItems();
        System.out.println("Total : $" + cart.calculateTotal());
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
