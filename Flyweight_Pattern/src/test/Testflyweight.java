package test;

public class Testflyweight {
	private static CoffeeFlavor[] flavors = new CoffeeFlavor[100];
	private static CoffeeOrderContext[] tables = new CoffeeOrderContext[100];
	
	private static int orderMade = 0;
	private static CoffeeFlavorFactory flavorFactory;
	public static void takeOrders(String flavorIn, int table) {
		flavors[orderMade] = flavorFactory.getCoffeeFlavor(flavorIn);
		tables[orderMade++] = new CoffeeOrderContext(table);
	}
	
	public static void main(String[] args) {
		flavorFactory = new CoffeeFlavorFactory();
		takeOrders("Cappuccino",2);
		takeOrders("Cappuccino",2);
		takeOrders("Frappe",1);
		takeOrders("Frappe",1);
		takeOrders("Xpresso",1);
		takeOrders("Frappe",897);
		takeOrders("Cappuccino",97);
		takeOrders("Cappuccino",97);
		takeOrders("Frappe",3);
		takeOrders("Xpresso",3);
		takeOrders("Cappuccino",3);
		takeOrders("Frappe",552);
		takeOrders("Cappuccino",121);
		takeOrders("Xpresso",121);
		
		for(int i = 0; i < orderMade; ++i) {
			flavors[i].serveCoffee(tables[i]);
		}
		System.out.println(" ");
		System.out.println("total CoffeeFlavor objects made: " + flavorFactory.getTotalCoffeeFlavorsMade());
		
	}
}
