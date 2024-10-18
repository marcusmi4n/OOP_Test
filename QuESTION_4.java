import java.util.Scanner;

public class QuESTION_4 {
    public static void main(String[] args) {
        Scanner mult = new Scanner(System.in);

        int num;
        int j;

        System.out.println("ENTER NUMBER: ");
        num = mult.nextInt();

        System.out.println("    MULTIPLICATION TABLE    ");

        for (j = 1; j < 11; j++) {

            int ans = j * num;

            System.out.println( j+" x "+num+ " = "+ans);
            
        }
        
        mult.close();
    }
    
}
