package _15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int answer=0;

            for(int i=n+1; i<=2*n; i++){ // n보다 크고 2n보다 같거나 작은 수
                if (isPrime(i)) answer++;
            }
            System.out.println(answer);
        }
    }

    public static boolean isPrime(int n) { // 소수 판별
        if(n==1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}