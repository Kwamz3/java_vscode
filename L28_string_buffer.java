public class L28_string_buffer {
    public static void main(String[] args) {
       
        // string buffer give a buffer size of 16 and have the ability to be changed
        StringBuffer sb = new StringBuffer("Charles");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.append(" Appiah");
        sb.insert(0, "Java");

        // there's only one difference between the string builder and string buffer and that is the string buffer is 
        // thread safe while string builder is not
        System.out.println(sb);
    }
}
