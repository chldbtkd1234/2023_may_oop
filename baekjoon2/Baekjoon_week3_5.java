package week3;

import java.util.Scanner;

public class Baekjoon_week3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int alam = sc.nextInt();
		
		if ( alam < 45 ) {
			time --;
			alam = 60-(45-alam);
			if ( time < 0 ) {
				time = 23 ;
			                }
			System.out.println(time + " " + alam);
				
		                 }
		
		else {
			
			alam = alam - 45;
			
			System.out.println(time + " " + alam);
			
		     }
		
	}

}
