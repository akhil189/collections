
public class Main {

	public static void main(String[] args) {
	
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAdd1("Tomato", 0.27);
		hamburger.addHamburgerAdd2("Lettuce", 0.75);
		hamburger.addHamburgerAdd3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizeHamburger() ); 
	
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAdd1("Egg", 5.43);
		healthyBurger.addHealthAddition1("Lentils", 3.41);
		System.out.println("Total Healthy Burger Price is "+ healthyBurger.itemizeHamburger());
	
		DeluxeBurger db = new DeluxeBurger();
		db.itemizeHamburger();
	}

}
