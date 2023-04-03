import java.util.Scanner;

public class B_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(max + "," + min);
    }


}
