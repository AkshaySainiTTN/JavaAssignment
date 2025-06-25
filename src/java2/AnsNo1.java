// Enum representing simple house types with prices
enum House {
    HUT(500),
    FLAT(1000),
    BUNGLA(2000);
    private int price;

    // in enum we use constructor to set the price but cant have setters because values are constant
    // still we can ues constructor because at the time of creation of object it call it so assign values at one time
    // Why constructor is allowed?
    // Constructor is used only once, when enum constants are created
    // You cannot call the constructor yourself, Java calls it internally during enum setup
    // So we use constructor to assign values at the time of enum creation.
    House(int price) {
        this.price = price;
    }

    //we can define getter to get value while iterating over it
    public int getPrice() {
        return price;
    }
}

public class AnsNo1 {
    public static void main(String[] args) {
        // Display each house and its price
        for (House h : House.values()) {
            System.out.println(h + " costs is " + h.getPrice());
        }
    }
}
