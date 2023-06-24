package _01;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// while 문 만들기
		//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		//출력형식과 같게 N*1부터 N*9까지 출력한다.
		
		Scanner sc = new Scanner(System.in) ;
		
        int n = sc.nextInt();
        
        int m = 1;
        
        while(m<10){
            int result = n*m;
            System.out.println(n+" * "+m+" = "+result);
            m++;
        }
		
		
		
		
		

	}

}
