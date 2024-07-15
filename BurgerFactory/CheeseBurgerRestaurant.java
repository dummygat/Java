

public class CheeseBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Cheese Burger...");
        return new CheeseBurger();
    }
}
