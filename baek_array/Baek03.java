package _10Week;

import java.util.Scanner;

public class Baek03 {

	public static void main(String[] args) {
		// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		//예제 입력:
        //5
		//20 10 35 30 7
		//출력의 예:
		//7 35
		
	      Scanner sc = new Scanner(System.in);
	      int name = sc.nextInt(); //첫째줄의 n값
	      int[] array = new int[name];//위의 n값 만큼의 배열 방수 생성
	      int min = 0; int max = 0;
	      
	      for (int i = 0; i < name; i++) {// 포문을 이용해서 name입력값 보다 작을 동안 i는 반복한다.
	    	  array[i] = sc.nextInt();// 어레이i에 이제 name값 만큼 배열방안에 숫자를 입력받을 수 있다.
	                //예시: 20 10 7 35 25를 입력받을 수 있다.                     }
	      
	      
	      min = array[0]; // 오늘 새로 배운것. array[0] 즉 어레이 배열 인덱스 첫번째 값은 min에 저장된다. 위의 예시 대로면 첫번째 인덱스값인 20을 min 변수에 대입하게 된다.
	      max = array[0]; // 초기값은 맨 앞에 적힌 숫자로 설정된다. 마찬가지로 max 변수에 20을 대입한다.
	      
	      for (int j = 0; j < name; j++) {
	    	  if (min > array[j])  {  // 이제 조건 문으로 넘어가서 위에 min 맨 첫번째 인덱스 값인 20과 20, 10, 7 35 25를 순차적으로 비교한다.
	    		  min = array[j];     // 그리고   만약에 순차적으로 비교하면서 min(20)보다 작은 수가 나오면 갱신된다. 예로 20과 10을 비교하면 20이 크기 때문에 10이 대입되고 다음은 7과 비교했을 때 10이 크기 때문에 7이 대입된다.
	    	                                                  }
	    		                    
	    	                                        
	    	  if (max < array[j])  {
	    		                     max = array[j];
	    	                                        }
	    	  
	                                     }
	      System.out.println(min + " " + max);
	      
	      sc.close();
		
	}

}
	
}