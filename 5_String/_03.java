package _05_String;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스의 개수 선언
		int T = sc.nextInt();

		String[] arr = new String[T];

		// 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();

		// 입력받은 문자열을substring으로 0번째 끝번째를 출력한다.
		for (int i = 0; i < arr.length; i++) {

			
			if (arr[i].length() < 1) {
				System.out.println(arr[i] + "" + arr[i]);
			} else {
				System.out.print(arr[i].substring(0, 1)); 
				System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));// 끝에서 -1번째부터 끝번째까지
			}

		}
	}

}