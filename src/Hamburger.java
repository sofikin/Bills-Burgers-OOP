public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;  
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println(this.name + " on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        if (addition1Name != null){
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            totalPrice += this.addition1Price;
        }
        if (addition2Name != null){
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            totalPrice += this.addition2Price;
        }
        if (addition3Name != null){
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            totalPrice += this.addition3Price;
        }
        if (addition4Name != null){
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            totalPrice += this.addition4Price;
        }
        return totalPrice;
    }

}

