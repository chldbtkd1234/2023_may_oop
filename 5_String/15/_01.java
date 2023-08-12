package _15;

import java.util.Scanner;

public class _01 {
	//백준 최소공배수 1934

	// 최대공약수 구하기 예) 6 10
	public static int GCD(int a, int b) {

		// 큰숫자를 작은숫자로 나눈 나머지를 계산
		int r = a % b;
		// 나머지가 0이면 작은 숫자가 최대 공약수 이므로 작은 숫자를 리턴한다.
		// 예) 4 2 -> 4를 2로 나누면 나머지가 0이다. 즉 2는 최대 공약수가 된다.
		if (r == 0) {
			return b;

			// 만약 나머지가 0이 아니라면 b가 a자리로 가고, a를 b로 나눈 나머지가 b의 자리로 간다.
			// 예) 6 10 -> GCD(10, 6) -> GCD(6, 4) -> GCD(4, 2)
			// 이제 4에서 2를 나누면 나머지가 0이 되므로 2가 최대공약수가 된다.
		} else {
			return GCD(b, a % b);
		}
	}

	// 최소공배수 구하기
	public static int LCM(int a, int b) {
		// 최소공배수는 두 수를 곱하고 최대 공약수로 나눈다.
		// 예) 6 10 -> 6 * 10 / 2 .... 즉 30이 최소공배수
		return a * b / GCD(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		//두 수 입력받고 테스트 케이스 만큼 반복
		for (int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(LCM(A, B)); //최소공배수
		}
		sc.close();

	}

}