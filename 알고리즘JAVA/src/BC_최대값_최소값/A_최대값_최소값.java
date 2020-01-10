package BC_최대값_최소값;

import java.util.Scanner;

public class A_최대값_최소값 {
	public static void main(String[] args) {
		
		/*    
		 *     10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료 중 가장 큰 값을 구하시오.
		 */
		
				
		//답1번  = 내가 푼것
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10]; int max, min, tmp;		
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자를 입력하세요");
			n[i] = sc.nextInt();
		}
		max = n[0];
		min = n[0];

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			max = n[0];
			min = n[0];
			for (int i = 0; i < 10; i++) {
				if (n[i] > max) {
					max = n[i];
				}
				if (n[i] < min) {
					min = n[i];
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(max+" , "+min);
		
		
		//답2번  = 책답
		int i;
		max = n[0];
		min = n[0];
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		

			max = n[0];
			min=n[0];
			for (i = 0; i <= 9; i++) {
				if (n[i] > max) {
					max = n[i];
				}
				if (n[i] < min) {
					min = n[i];
				}
			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(max+" , "+min);

		
	}
}
