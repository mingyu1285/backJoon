import java.util.Scanner;

public class B_2_1330 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b;
        a= s.nextInt();
        b= s.nextInt();

        if (a>b){
            System.out.println(">");
        } else if (a == b) {
            System.out.println("=");
        } else if (a<b) {
            System.out.println("<");

        }
    }
}
