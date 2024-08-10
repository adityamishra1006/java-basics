package javaDevelopment.Day4;

// Object class is called by default

class Laptop{
    String brand;
    int price;


    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();    
        obj1.brand = "Asus Vivobook";
        obj1.price = 50000;


        Laptop obj2 = new Laptop();    
        obj2.brand = "Asus Notebook";
        obj2.price = 50000;

        boolean res = obj1.equals(obj2) ;

        System.out.println(res);
        // It will return the class name + @ + something in hexa string
    }
}
