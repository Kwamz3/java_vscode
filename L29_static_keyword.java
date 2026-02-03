class Mobile {
    
    // these are instance variables
    String brand;
    int price;
    static String name; // when using the static keyword the instance variable becomes common to all the variables using the static keyword

    public void show() {
        // varaiables created in a method are called local variables
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}

public class L29_static_keyword {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name = "Smartphone";   
        Mobile.name = "Phone";  // static variables should be accessed with the class name of the instance variable
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name = "Smartphone";   // calling it by the instance variable is not the best way to do it
        Mobile.name = "Phone";
        
        obj1.show();
        System.out.println(" ");
        obj2.show();

    }
}
