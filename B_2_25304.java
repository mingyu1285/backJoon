import java.util.Scanner;

public class B_2_25304 {

    public static void main(String agrs[]){
        int a,b,X,N;
        int sum;

        Scanner s = new Scanner(System.in);

        X = s.nextInt(); //영수증에 적힌 총 금액 X
        N = s.nextInt(); //영수증에 적힌 구매한 물건의 종류의 수

        for (int i =1; i<=N; i++){ //물건의 종류의 수 만큼 반복문 실행
            a = s.nextInt(); //물건의 가격 4000
            b = s.nextInt(); // 물건의 개수 5

            X = X - (a*b);

        }
        if (X == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
