public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Hamburger", "Sausage & Bacon", "White roll", 14.54);
        super.addHamburgerAddition1("Chips", 2.74);
        super.addHamburgerAddition2("Drink", 1.81);


    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
