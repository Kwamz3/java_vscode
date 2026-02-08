class Human {
    // int age;
    // String name;

    // the use of private restricts access of data pertaining to only the class of that entity
    // whichs means it acnnot be used outside the class of the entity
    private int age;
    private String name;

    // we can access the data indirectly by using a method
    public int getAge() {
    
        return age;
    }

    // we can also set the data indirectly by using a method
    public void setAge(int a){
        age = a;
    }

    public String getName() {

        return name;
    }
    
    public void setName(String n){
        name = n;
    }

}
 
public class L32_encapsulation {
    public static void main(String[] args) {
        
        // through the use of the private keyword we can see that the "age" and "name" variables have become
        // inaccessible
        Human obj = new Human();
        obj.setName("Appiah");
        obj.setAge(21);

        // this data can be accessed by everyone just by calling the object and locating the name of the
        //  variable
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
