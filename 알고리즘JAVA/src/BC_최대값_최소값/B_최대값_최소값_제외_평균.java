package BC_최대값_최소값;

import java.util.Scanner;

public class B_최대값_최소값_제외_평균 {
	public static void main(String[] args) {
		
		/*    
		 *     7명의 채점 점수 중에서 최하위 점수와 최상위 점수를 제외한 5명 점수의 평균을 구하시오.
		 *     단, 7명의 채점 점수는 배열에 들어 있다. 
		 */
		
				
		//답1번  = 내가 푼것
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7]; int result=0 , max, min;		
		for (int i = 0; i < 7; i++) {
			System.out.println("숫자를 입력하세요");
			a[i] = sc.nextInt();
		}
		max = a[0];
		min = a[0];
		result = 0;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			max = a[0];
			min = a[0];
			result = 0;
			for (int i = 0; i < 7; i++) {
				result += a[i];
				if (a[i] > max) {
					max = a[i];
				}
				if (a[i] < min) {
					min = a[i];
				}
			}
			result = (result - max - min)/5;

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		//답2번  = 책답
		int hap, avg, i;
		max = a[0];
		min = a[0];
		hap = a[0];
		avg=0;
		i = 0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			min = a[0];
			max = a[0];
			hap = a[0];
			i = 0;

			while (i < 6) {
				i++;
				hap += a[i];
				if (a[i] < min)
					min = a[i];
				if (a[i] > max)
					max = a[i];
			}
			hap = hap - min - max;
			avg = hap / 5;

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(min+" , "+ max +" , "+ hap +" , "+ avg);

		
	}
}
