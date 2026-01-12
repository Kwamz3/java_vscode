public class L23_drawbacks_of_array {
    public static void main(String[] args) {
        
        int star[] = new int[3];
        // When a data space is taken in an array it is continuous which means it cannot be changed or modified
        // In the case of a search it will tranverse all the elements before giving the results which takes some time 

        star[0] = 1;
        star[1] = 6;
        star[2] = 9;

        for(int m: star){
            System.out.print(m + " ");
        }
    }
}
