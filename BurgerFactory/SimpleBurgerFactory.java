

public class SimpleBurgerFactory {
	public Burger createBurger(String request)
	{
		Burger burger = null;
		if ("CHEESE".equals(request)) {
			burger = new CheeseBurger();
		}
		else if ("VEGGIE".equals(request)) {
			burger = new VeggieBurger();
		}
		return burger;
	}
	

}