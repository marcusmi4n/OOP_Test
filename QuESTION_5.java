import java.util.Scanner;


public class QuESTION_5 {

    public static void greetUser(String name) {
        
        System.out.println("You are welcome, "+name);

    }
    
    public static void greetUser(){

        System.out.println("You are welcome, New User.");
    }

    public static void main(String[] args) {
        Scanner greet = new Scanner(System.in);

        String nam;

        System.out.println("ENTER NAME:");

        nam = greet.nextLine();

        if(nam.length() > 0){

            greetUser(nam);

        } else {
            greetUser();
        }

        greet.close();
    }
}
