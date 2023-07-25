package _10Week;

import java.util.Scanner;

public class Baek02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number= sc.nextInt(); // 입력받을 n값
		int x = sc.nextInt(); //x값
		
		int[] score = new int[number]; // n값의 배열칸
		
		for (int i = 0; i < number; i++) { // i는 n값보다 작을 동안 반복
				score[i] = sc.nextInt();   // 입력받을 배열		
		                                  }
		
		for (int k = 0; k < score.length; k++) {
			if (score[k] < x) {
				System.out.print(score[k] + " ");
			                  }
		                                       }
		
	}

}
