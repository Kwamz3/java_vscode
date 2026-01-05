public class L10_ternary_op {
    public static void main(String[] args) {
        int x = 6;
        int result = 0;

        // if(x % 2 == 0)
        //     System.out.println("number is even");
        // else
        //     System.out.println("number is odd");

        // Ternary operation
        // if condition ? then condition : else condition

        result = (x % 2 == 0) ? 10 : 20;

        System.out.println(result);
    }
}
