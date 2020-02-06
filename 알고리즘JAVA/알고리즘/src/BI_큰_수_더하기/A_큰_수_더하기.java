package BI_큰_수_더하기;

import java.util.Scanner;

public class A_큰_수_더하기 {
	public static void main(String[] args) {
		
		/*    
		 *           
		 */
		
		
		//답1번  = 내가 푼것
		int a[] = new int[12];  int result[] = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
		int plus;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요\n");
			for (int i = 0; i < 12; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i <= 11; i++) {
				result[i + 2] += a[i];
			}
			if(a[0]==0) {
				break;
			}
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			plus = 0;
			int k;
			for (k = 13; k >= 0; k--) {
				result[k] += plus;
				result[k] %= 10;
				plus /=10;
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i < 14; i++) {
			System.out.print(result[i]);
		}
		System.out.println();
		
		
		
		
		
		
		//답2번  = 책답
		int i, j, mok, nmg;
		int b[] = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
		j=0;
		for(int k=0 ; k<14 ; k++) {
			b[k] = result[k];
		}
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		

			
				for (i = 13; i >= 1; i--) {
					mok = b[i] / 10;
					nmg = b[i] - mok * 10;
					b[i] = nmg;
					b[i - 1] += mok;
				}
				if (b[0] == 0)
					j = 1;
				else
					j = 0;
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (i = j; i <= 13; i++) {			
			 System.out.print(b[i]);
		}
		System.out.println();

		
	}
}
