package B수학;

import java.util.Scanner;

public class C_소수판별_제곱근이용하기 {
public static void main(String[] args) {
		
		/*
		 * 소수 판별
		 * 소수란 1보다 크며 1과 자기 자신만을 약수로 가지는 수를 의미합니다. 
		 * (1보다 커야 하기 때문에 1은 소수가 아니다. )
		 */
		
				
		//답1번  = 내가 푼것
		int n; String resultText = null;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n);
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			
			int i = 2; 
			while(true) {				
				if(n%i==0) {
					if(n==i) {
						resultText = "소수";
						break;
					}else {
						resultText = "소수 아님";
						break;
					}
				}else {
					i++;
				}
			}		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i=2;
			while(n%i!=0)
				i++;
			if(n==i) {
				resultText = "소수";
			}else {
				resultText = "소수 아님";
			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
