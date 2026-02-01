public class L28_string_buffer {
    public static void main(String[] args) {
        String name = "Charles";

        // In the case of this variable where we're appending it with a different string
        // the initial variable "name" is not changed  it just creates a new string object
        name = name + " Appiah";
        System.out.println(name);

        // with this example we're using having 2 variables wiith the same string and as far as we know 
        // that in the heap memory where the string constant pool is there cannot be 2 of a particular string
        // the address in that string will just be rerouted to the new variable
        String s1 = "Bape";
        String s2 = "Bape";

        // here we see that it is true that both "s1" and "s2" are the same which means they're the same string
        System.out.println(s1 == s2);
    }
}
