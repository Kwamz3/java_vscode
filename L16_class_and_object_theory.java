class Calculator {
    
    int a;
    
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r; // a return statement is required in every class
    }
}

public class L16_class_and_object_theory {
    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        //treating Calculator as a type, calc as a reference variable name to access the methods of the Calculator, the
        // new keyword to take the space of creating the object and adding it to the Calculator() constructor

        int result = calc.add(num1, num2);
        // when calling the method to access the properties of the method you can pass the parameters directly into the instance
        // of the method
        System.out.println(result);


        // object - properties and behaviours
        // the class file is the blueprint for the object
    }
}
