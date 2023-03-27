import java.util.Scanner;

public class B_10_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a= s.nextInt(); // 156
        b= s.nextInt(); //678

        int c = (b%10)*a;
        int d = ((b%100)/10)*a;
        int e = (b/100)*a;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);

    }
}
