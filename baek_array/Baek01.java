package _10Week;

import java.util.Scanner;

public class Baek01 {

	public static void main(String[] args) {
		// 입력: 11
		// 입력:  1 4 1 2 4 2 4 2 3 4 4
		// 입력: 2
		
		//출력: 3
		
	   Scanner sc = new Scanner(System.in);
	   
	   int number = sc.nextInt(); // 정수형 입력값
	   int[] score = new int[number]; // number만큼 의 배열칸
	   
	   for (int i = 0; i < number; i++) {// i는 number의 입력값 보다 작을 동안 반복
		   
		   score[i] = sc.nextInt(); 
	                                    }
	   
	     int count = 0;
	     
	   int number2 = sc.nextInt();
	   for (int j = 0; j <score.length; j++) {
		   if (number2 == score[j]) {
			   count++;
		                             }
		   
	                                            }
	   System.out.println(count);	   

	}

}
