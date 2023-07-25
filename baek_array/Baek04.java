package _10Week;

import java.util.Scanner;

public class Baek04 {

	public static void main(String[] args) {
		
		
		
		
        Scanner sc = new Scanner(System.in);
        
        int scoreBoard[] = new int[9];
        int max = 0; int index = 0;
        max = scoreBoard[0];
        
        for (int i = 0; i < 9; i++) {
        	scoreBoard[i] = sc.nextInt();
            if (max < scoreBoard[i]) {
                max = scoreBoard[i];
                index = i+1;
                                      }
            
                                     }
        
        
        
        System.out.println(max);
        System.out.println(index);	
        sc.close();
		
		
/*                           주석!!!!!!!!!!!!
 * 
 * 
          // 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        //예를 들어, 서로 다른 9개의 자연수
        //3, 29, 38, 12, 57, 74, 40, 85, 61
        //이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	
	  
	Scanner sc = new Scanner(System.in);
	
	int[] maximum = new int[9];
	int max = 0; int index = 0;
	
	for (int i = 0; i < 9; i++) {
		
		maximum[i] = sc.nextInt();
	}
	
	max = maximum[0];// 위에서 배열은 9칸을 입력 받는데, 입력받는 숫자의 첫 배열0칸에 있는 숫자를 지정 위의 경우 3을 지정하게 된다.
	for (int k = 0; k < maximum.length; k++) {
		if (max < maximum[k]) {//max는 maximum배열안의 숫자보다 만약에 작으면
			max = maximum[k];// max안에 maximum배열안 숫자로 재갱신된다. 언제까지? maximum.length보다 즉 9번을 돌때까지 지속
			index = k+1; // k가 0번부터 시작하니까 85가 만약에! 7번째 칸이면 배열은 6번이라는 칸에 있으니까 1을 더해준다.
		                 // 즉,  3, 29, 38, 12, 57, 74, 40, 85, 61 대로 입력받으면 for문 9번 돌지만 if문에서는 조건문이 참일동안 갱신되기 때문에 maximum[85]를 비교하고
			             // maximum[85] -> maximum[61] 85다음 오는 숫자가 61이기 때문에 갱신되지 않음! 그러면 결과적으로 3부터 85까지 총 8번 갱신되고 9번째에서는 갱신되지 않는다.
                         // 그래서 index는 if문 안에서 몇번 				
			
			                                  }
		
	}
	
	System.out.println(max);
	System.out.println(index);

    sc.close(); 
    내가 푼 방법
*/		
		
		
		
		
		
	}

}
