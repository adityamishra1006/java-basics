package javaDevelopment.Day4;

enum Laptop{
    Macbook(90000), XPS(130000), Surface(150000), Thinkpad(30000);

    private int price;
    
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class enums2 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.XPS;
        // System.out.println(lap + ":"+lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + String.valueOf(lap.getPrice()));
        }
    }
}
