public class L26_what_is_string {
    public static void main(String[] args) {

        // string is not a primitive type so we have to create an object of it to use it
        // String name = new String();

        // we create the name when we pass it in the String constructor
        String name = new String("Charles");
        // System.out.println(name);

        // concatenation works with strings
        System.out.println("hello " + name);
        // System.out.println(name.concat( " kwame"));

        // but most of the time you'll see because java will do the object creation automatically
        String name2 = "Charles";
        System.out.println(name2);
    }
}
