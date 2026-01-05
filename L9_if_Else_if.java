public class L9_if_Else_if {
     public static void main(String[] args) {
        
        // int x = 28;
        // if (x > 10 && x <= 20) //expected value is from 11-20
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye");

        int x = 9;
        int y = 7;
        int z = 5;
        // int x = 5;
        // int y = 7;

        if (x > y && x > z) //expected value is from 11-20
        {
            System.out.println("x is greater than y and z");
            // System.out.println("That's it...");    
        }
        // if the operation goes to the next line it means the x value is smaller than the y so there's no need 
        // to check if y > x because x is not the greatest
        else if (y > z) 
        { // when printing more than one statement use the curly bracket
            System.out.println("y is greater than x and z");
            // System.out.println("That's it..."); 
        }
        else
            System.out.println("z is greater than x and y");
    }
}
