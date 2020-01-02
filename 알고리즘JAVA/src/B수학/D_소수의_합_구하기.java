package B수학;

import java.util.Scanner;

public class D_소수의_합_구하기 {
public static void main(String[] args) {
		
		/*
		 * 임의의 정수를 입력 받아 그 안에 포함된 소수의 합을 구하시오. 
		 */
		
				
		//답1번  = 내가 푼것
		int n; String resultText = null;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n);
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			


			int result=0;
			for (int i = 2; i <= n; i++) {
				int j=2;
				while (true) {
					if (j <= Math.sqrt(i)) {
						if (i%j == 0) {
							break;
						}
						else {
							j++;
						}
					}
					else
					{
						result += i;
						break;
					}			
				}
			}
			resultText = Integer.toString(result);
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i; int j; int result;
			i = 2;
			result = 0;


			while (true) {
				j = 2;
				while (i % j != 0)
					j++;
				if (i == j) {
					result += i;
				}
				if (i < n) {
					i++;
				}
				else {
					resultText = Integer.toString(result);
					break;
				}
			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
