package practice2;

import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=====================================");
        System.out.print("번호를 선택하시오: ");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature ;
        String unit;
        String convertedUnit;

        unit = (choice == 1) ? "화씨" : "섭씨";
        convertedUnit = (choice == 1) ? "섭씨" : "화씨";

        System.out.print(unit + " 온도를 입력하시오: ");
        temperature = scanner.nextDouble();

        convertedTemperature = (choice == 1) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;

        System.out.println(convertedUnit + " 온도는 " + convertedTemperature);

        scanner.close();
    }
}