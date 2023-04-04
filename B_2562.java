import java.util.Scanner;

public class B_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr;
        int index = 0;
        int N = s.nextInt();
        arr = new int[N];
        int max = arr[0];

        for (int i = 0; i<N; i++){
            if (arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
    }
}
