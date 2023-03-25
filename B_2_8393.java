import java.util.Scanner;

public class B_2_8393 {
    public static void main(String[] args) {
        int n,t;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        for (int i=1; i<n; i++){
            n=i+1;
        }
        System.out.println(n);
    }
}
