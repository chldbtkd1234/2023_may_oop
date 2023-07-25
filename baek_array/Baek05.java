package _10Week;

import java.util.Scanner;

public class Baek05 {

	public static void main(String[] args) {
		/* 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
		 * 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 
		 * 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
              도현이는 앞으로 M번 공을 넣으려고 한다. 
              도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 
              만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 
              공을 넣을 바구니는 연속되어 있어야 한다.
              공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
              
               첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
              둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
              각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 
              예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
              도현이는 입력으로 주어진 순서대로 공을 넣는다.
              
              */
		//아.... 3시간만에 이해 완료
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// 바구니 갯수 배열
		int number[] = new int[N]; //배열 바구니
		int M = sc.nextInt(); // 공을 던지는 횟수
		
		for (int i = 0; i < M; i++) {
			int dis = sc.nextInt(); // dis바구니 부터
			int tance = sc.nextInt();// tance 바구니까지
			int ball = sc.nextInt(); // ball을 넣는다.
			for (int j = dis - 1; j < tance; j++) {// j는 dis-1인 이유는 배열은 0부터 시작하니깐 // 즉 1번 바구니에 넣으려면 배열 인덱스번호는 처음이 0라서 1을 빼줘야하는 것.
				number[j] = ball;
			                                      }
		                            }
		
		for (int k = 0; k<number.length; k++) {
			System.out.print(number[k] + " ");
		}
		
		
		
		

	}

}
