package BaekJoon;

import java.util.Scanner;

public class B_1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int list = s.nextInt();
        int n [] = new int[list]; //몇 과목인지 개수에 맞게 배열 생성
        float m = 0;
        float avg = 0;

        for (int i = 0; i < n.length; i++) { // 과목 개수에 맞게 점수 넣는 for문
            n[i] = s.nextInt();
            if (n[i]>m){
                m = n[i];
            }
        }


        for (int i = 0; i < n.length; i++) {
            avg += (n[i]/m*100)/list;
        }

        System.out.println(avg);
//        System.out.println(m); 최대 값 출력


//        for (int i = 0; i < n.length; i++) { //한 과목당
//            n[i] = n[i]/(m*100);
//            avg = n[i];
//        }
//        System.out.println(avg/list);











    }
}
