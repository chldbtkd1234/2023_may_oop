package _09_baek;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {//
            int K = sc.nextInt();
            boolean Sosu = true;
            if(K==1){
                continue;
            }
            for(int j=2; j<K; j++) { 
                if (K % j == 0) {
                    Sosu = false;
                }
            }
                if(Sosu) {
                    count++;
                }
        }
        System.out.println(count);
    }
}