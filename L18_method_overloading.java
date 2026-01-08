class Calculator {
    
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    
    // The name of the method can be the same what needs to change is the parameters
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // You can also have same number of parameters but of different type
    // The return type doesn't matter what matters is the name of the method and the parameters
    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class L18_method_overloading {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();

        int r1 = obj.add(2, 5);
        System.out.println(r1);
    }
}
