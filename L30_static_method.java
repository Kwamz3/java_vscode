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

        // you cannot use an instance variable in a static method because instance variables can differ from each other especially
        // with the same variable name and to avoid confusion of which variable is being referred to this is not allowed
        // System.out.println("Brand: " + brand);
        // System.out.println("Price: " + price);
        // System.out.println("Name: " + name);
    }

    public static void show2(Mobile obj1) {    // we pass the class name alongside the specific obj we're referencing in the method as a parameter #3
        // However there's an indirect way to use an instance variable in a static method #1
        System.out.println("Brand: " + obj1.brand); // and reference it by calling the instance variables with the help of the obj1 we passed earlier #4
        System.out.println("Price: " + obj1.price);
        System.out.println("Name: " + name);
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

        // Mobile.show2();
        
        // by passing the object that you want to use the static referencing with when calling the method #2
        Mobile.show2(obj1);
    }
}
