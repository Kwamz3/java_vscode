public class L11_switch_statement {
    public static void main(String[] args) {

        int n = 4;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break; //once the switch statement matches with the condition it'll try to execute the rest of the code so break
                       //stops execution of the rest of the code 
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number...");
        }
    }
}
