public class L7_logical_op {
    public static void main(String[] args) {
        
        
        // Checking logical operations with 3 main operations
        // AND -> &   *   oR -> |   *   NoT -> !
        
        // For AND operations
        // T   T   ->  T
        // T   F   ->  F
        // F   T   ->  F
        // F   F   ->  F
        
        // For oR operations
        // T   T   ->  T
        // T   F   ->  T
        // F   T   ->  T
        // F   F   ->  F
        
        // For NoT operations
        // T   ->  F
        // F   ->  T
        
        
        // Short hands and Short circuits
        
        // &   |   !   ->  short hand
        // &&   ||   !   ->  short circuit 

        // In the case of [ r = x > y || a > b ]
        //                  T     T        T
        // The operation will be true when the first element of the operation is true  
    
        // In the case of [ r = x > y && a > b ]
        //                  F     F        T
        // The operation will be false when the first element of the operation is false  
        
        double x = 6.8;
        double y = 7.8;
        
        int a = 8;
        int b = 6;
        
        // boolean result = x < y && a < b;
        boolean result = x < y || a < b;
        
        System.out.println(result);
        // System.out.println(!result);
    }
}
