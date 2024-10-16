import java.util.Scanner;

public class QuESTION_2 {
    public static void main(String[]args){
        Scanner circle = new Scanner(System.in);

        double r;
        int radius;

        System.out.println("Enter Radius:");
        r = circle.nextDouble();

        double a = 3.14 * (r * r);

        //Area of the circle
        System.out.println("CIRCLE AREA :"+ a);

        
        int areaint =(int) a;

        System.out.println("CIRCLE AREA INTEGER :" + areaint);

    }

}
