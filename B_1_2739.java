import java.util.Scanner;

public class B_1_2739 {
    public static void main(String agrs[]){
        Scanner s = new Scanner(System.in);

        int a;
        a= s.nextInt();

        if (a>1){
            for (int i=1; i<10; i++){
                System.out.println(a+" * "+i + " = " + (a*i));
            }
        }
    }
}
