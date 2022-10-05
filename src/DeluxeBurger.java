public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Hamburger", "Sausage & Bacon", "White roll", 14.54);
        super.addHamburgerAddition1("Chips", 2.74);
        super.addHamburgerAddition2("Drink", 1.81);
    }

}
