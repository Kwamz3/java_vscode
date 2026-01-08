class Computer {
    
    // Every method has a particular access given to it
    // when defining a method adding "void" to the making of the method makes it non-returnable
    public void playMusic() {
        System.out.println("Music Playing...");
    }
    
    // Whatever type you would want to return should be stated while making the method
    // You can pass variables into the method 
    public String getPen(int num) {
        if (num >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class L17_methods {
    public static void main(String[] args) {
        
        Computer comp = new Computer();

        comp.playMusic();
        String str = comp.getPen(1);
        System.out.println(str);

    }
}