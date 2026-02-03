class Mobile {
    
    String brand;
    int price;
    static String name;

    public void show() {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
    
    // you can call a static method with the class name of the method
    public static void show1() {
        System.out.println("In static method...");
    }
}

public class L30_static_method {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Phone";  
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Phone";

        Mobile.show1();
    }
}
