package BF_7에_가까운_수;

import java.util.Scanner;

public class A_7에_가까운_수 {
	
	// static 변수로 선언해 준다. 
	public static int FIND = 7;
	
	public static void main(String[] args) {
		
		/*    
		 *          10개의 1자리 양의 정수를 입력 받아 배열에 저장한 후   
		 *          저장된 자료 중 7에 가장 가까운 자료를 찾으시오.
		 *          단, 자료는 1자리 정수이고 근사값이 2개인 경우에는 나중에 찾은 값을 출력한다. 
		 */
		
				
		//답1번  = 내가 푼것
		int a[] = new int[10]; int num , gap , tmp, result;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		result = 0;
		num = 7;
		gap = 10;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	


			num = 7;
			gap = 10;
			
			for (int i = 0; i < 10; i++) {
				if (a[i] >= num) {
					tmp = a[i] - num;
				}
				else {
					tmp = num - a[i];
				}
				if (tmp < gap) {
					result = a[i];
					gap = tmp;
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		//답2번  = 책답
		int i, j, k, L, m;
		m = 0;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			j = 9;
			for (k = 0; k <= 9; k++) {
				if (a[k] >= FIND)
					L = a[k] - FIND;
				else
					L = FIND - a[k];
				if (L <= j) {
					j = L;
					m = a[k];
				}
			}

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(m);

		
	}
}
