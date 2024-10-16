import java.util.Scanner;

public class QuESTIOn_3 {
public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);

    int age;

    System.out.println("ENTER AGE:");
    age = sr.nextInt();

    if ( age > 17) {
        System.out.println("ELIGIBLE TO VOTE");       
    }else{
        System.out.println("NOT ELIGIBLE TO VOTE");
    }
} 
    
}
