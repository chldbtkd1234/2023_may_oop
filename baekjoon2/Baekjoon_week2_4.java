package week3;

import java.util.Scanner;

public class Baekjoon_week2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		if (x>0 && y>0) {System.out.println("1");}
		if(x<0 && y>0)  {System.out.println("2");}
		if(x<0 && y<0)  {System.out.println("3");}
		if(x>0 && y<0)  {System.out.println("4");}
				
		
		
	}

}
