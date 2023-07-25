package _10Week;

import java.util.Scanner;

public class Baek06 {

	public static void main(String[] args) {
		// 공바꾸기
		// n개의 바구니에 1~n번의 바구니를 가지고 있음
		// 그 n개의 바구니에는 바구니와 똑같은 번호를 가지고 있다.
		// m번의 공을 i바구니와 j바구니를 서로 교환
		// 서로 교환했을 때 서로 어떤 공이 들어 있는지 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		int M= sc.nextInt();// 공을 바꾸는 값
		int ballNumber[]= new int[N]; // N값만큼 배열 선언// 바구니와 공이 들어있음
		int temp; // 임시변수
		
		for (int i = 0; i < ballNumber.length; i++ ) {
			ballNumber[i] = i+1; // 인덱스값을 1번부터 시작하기 위해 1을 더해준다. 인덱스0이 인덱스 1부터 시작함.
		                                              }
		
		for (int j = 0; j < M; j++) {// 4번 반복하는 for 문
			int I = sc.nextInt(); // i바구니
			int J = sc.nextInt(); // j바구니  범위에 해당함
			temp = ballNumber[I-1]; // 임시변수에 ballNumber[I-1(0)]을 즉 0을 대입한다. 
			ballNumber[I-1] = ballNumber[J-1]; //ballNumber[I-1(0)]에 ballNumber[J-1(1)]을 대입한다. 즉 0 <-1을 넣는다 
			ballNumber[J-1] = temp;            //마지막으로 ballNumber[J-1(1)]에 임시변수에 저장해둔 0을 다시 대입해준다. 즉 1 <-0을 넣는다.
			                                   //그러면 i바구니와 j바구니 안의 공을 서로 교환하게 된다. 이것을 4번 반복 
		                             }
		
		for (int k = 0; k < ballNumber.length; k++) {
			System.out.print(ballNumber[k] + " ");//서로 바뀐 바구니 안의 공을 출력
		                                                }

	}

}
