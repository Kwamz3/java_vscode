public class L13_while_loop {
    public static void main(String[] args) {
        
        // int i = 1;

        // while(i <= 4)
        // {
        //     System.out.println("Hi " + i);
        //     System.out.println("Bye " + i); // here the condition stops at 4 and once the print statement is still in the loop it prints 4
        //     i++;
        // }
        // // i was declared outside the loop so the value remains and we get 5 in the bye printed statement
        // System.out.println("Bye " + i);

        int i = 1;

        while (i <= 4) {
            System.out.println("Hello " + i);

            int j = 1;

            while (j <= 3) {
                System.out.println("How are you? " + j);
                j++;
                System.out.println("Bye " + j);
            }
            i++;
        }
        
        System.out.println("Bye " + i);

    }
}
