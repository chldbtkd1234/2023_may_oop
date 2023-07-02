package _02_practice;

import java.util.Scanner;

public class MiniProject2 {
    public static void main(String[] args) {
        int answer = 50; // 정답을 설정합니다.
        int guess;
        int attempts = 0;
        boolean correct = false;

        Scanner scanner = new Scanner(System.in);

        while (!correct) {
            System.out.print("정답을 추측하여 보시오: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("제시한 정수가 낮습니다.");
            } else if (guess > answer) {
                System.out.println("제시한 정수가 높습니다.");
            } else {
                System.out.println("축하합니다. 시도횟수=" + attempts);
                correct = true;
            }
        }

        scanner.close();
    }
}
