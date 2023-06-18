package week3;

import java.util.Scanner;

public class Baekjoon_week2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int point = sc.nextInt();
		int result = point/10 ;
		String grade;
		switch (result) {
		
		case 10:
		case 9 : grade = "A" ; break ;
		case 8 : grade = "B" ; break ;
		case 7 : grade = "C" ; break ;
		case 6 : grade = "D" ; break ;
		default : grade = "F" ; break ;
		
		}
		
		System.out.print(grade);
		
		sc.close();
		
		
		
		
	}

}
