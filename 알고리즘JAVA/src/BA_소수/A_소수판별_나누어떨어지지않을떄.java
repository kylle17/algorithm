package BA_소수;

import java.util.Scanner;

public class A_소수판별_나누어떨어지지않을떄 {
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
			
			int i = 1; 
			while(true) {				
				i++;
				if(n%i==0) {
					resultText = n+"는 소수가 아닙니다.";  // String자료형에 int자료형을 넣는것은 엄청 비효율 적인 코드다. 
					break;
				}
				if(i>=n-1) {   
					resultText = n+"는 소수 입니다.";		
					break;
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
		
			int i; int j;
			i = n-1;
			j = 2;
			while(true) {
				if(j<=i) {
					if(n%j==0) {
						resultText = "소수 아님";
						break;
					}else {
						j++;
					}
				}else {
					resultText = "소수";
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
