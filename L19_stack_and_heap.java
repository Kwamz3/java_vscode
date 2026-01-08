class Calculator {
    
    public int add(int n1, int n2) {
        return n1 + n2;
    }

}

public class L19_stack_and_heap {
    public static void main(String[] args) {
        
        // Jvm has a feature where it utilises a last in first out eg: 5, 6, 7 you'll get 7 first
        // Stack is in a data sequence
        // Heap is an open pool of data
        // Every method has it's own stack

        Calculator obj = new Calculator();
        // (obj)This is a reference variable that is in the heap memory
        // also local variables like n1 and n2 are declared in a stack
        // while instance variables are in the heap memory 

        int r1 = obj.add(2, 5);
        System.out.println(r1);
        
    }
}
