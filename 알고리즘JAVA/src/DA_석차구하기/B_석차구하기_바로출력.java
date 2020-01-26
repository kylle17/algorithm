package DA_석차구하기;

import java.util.Scanner;

public class B_석차구하기_바로출력 {
	public static void main(String[] args) {
		
		/*    
		 *    10명의 학생의 국어, 수학 점수를 각각 입력받아 총점을 계산한 후 
		 *    총점 기준 내림차순으로 순위를 출력하시오.
		 *    단, 동점은 동석차로 하고 총점이 0인경우는 출력하지 않는다. 
		 */
		
		
		//답1번  = 내가 푼것
		Scanner sc = new Scanner(System.in);
		int kor[] = new int[10], math[] = new int[10], total[] = new int[10];;
		int i , j , k , rank;

		for (i = 0; i < 10; i++) {
			kor[i] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			math[i] = sc.nextInt();
		}

		for (i = 0; i < 10; i++) {
			total[i] = kor[i] + math[i];
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			


			for (i = 0; i < 10; i++) {
				rank = 1;
				for ( j= 0; j < 10; j++) {
					if (total[i] < total[j]) {
						rank++;
					}
				}
			}

		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);

		
		
		
		
		
		
		//답2번  = 책답
		int r=0;
	
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		


			i = -1;
			for (i = 0; i <= 9; i++) {
				if (total[i] != 0) {
					r = 1;
					for (j = 0; j <= 9; j++) {
						if (total[i] < total[j])
							r++;
					}
				}
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);

		
	}
}
