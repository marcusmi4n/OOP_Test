import java.util.Scanner;

public class QuESTION_6 {

    public static void main(String[] args) {

        Scanner avs = new Scanner(System.in);
    
        
    int i;
    int marks;
    int[] scores = new int[5];
    
    System.out.println("        STUDENT SCORES      ");
    System.out.println("ENTER MARK : ");

    for (i = 0; i < scores.length; i++){

        
        marks = avs.nextInt();

        scores[i]= marks;


        
        
    }

    System.out.println("    ELEMENTS    ");

    for (i = 0; i < scores.length; i++){

        System.out.println(scores[i]);
        
    }
    


    int length = scores.length;


     int sum = 0;
     for (int j = 0; j < length; j++) {

         sum += scores[j];
     }

     double average = sum / length;

     System.out.println("AVERAGE : "+average);
    
    }
    
    int
}
