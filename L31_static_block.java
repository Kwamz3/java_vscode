class Mobile {
    
    String brand;
    int price;
    static String name;

    // whenever you call the class the static block is loaded first then the constructor is loaded after the object follows
    static {
        name = "Phone";
        System.out.println("In static block");
    }
    
    public Mobile() {
        brand = " ";
        price = 200;
        System.out.println("In Constructor");
    }

    public void show() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}

public class L31_static_block {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Phone";
        
        // Mobile obj2 = new Mobile();

        // to just load the class without loading the constructor we use the class Class.forname
        Class.forName("Mobile");

    }
}
