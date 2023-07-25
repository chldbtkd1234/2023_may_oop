package _10Week;

import java.util.Scanner;

public class Baek07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] member = new int[31]; // 0~ 30번까지의 배열 즉 31개의 배열
		                            
		                            
		
		for (int i = 1; i < 29; i++) { // 1~29보다 작은 즉 1부터 28이기 때문에28번 순회함
			int successMember = sc.nextInt(); // 새로운 입력값을 받음 이것이 출석번호 호명과 같음
			member[successMember] = 1; // 28번 입력받으면 입력받은 숫자들의 변수를 다시 배열 안에 집어넣은 후 그 안에 1을 대입시킴
			
		                                }
		
		for (int i = 1; i < member.length; i++) { // 31개의 방이기 때문에 1부터 시작해야 0번을 제외한 30개의 방을 순회함
			if (member[i] != 1) {// 배열안에 1과 다르면
				System.out.println(i); // 1과 다른 숫자를 출력
			                             }
		                                              }
		
		sc.close();

	}

}
