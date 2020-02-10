package DE_배열;

import java.util.Scanner;

public class K_90도_회전하기 {
	public static void main(String[] args) {
		
	
		
		//답1번  = 내가 푼것
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int n = 0 , i=0 , j=0;
	
		
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			n = 0 ; i=0 ; j=0;
			for (i = 4; i >= 0; i--) {
				for (j = i; j < 5; j++) {
					n++;
					a[i][j] = n;
				}
			}
			for (i = 4; i >= 0; i--) {
				for (j = 4; j > i - 1; j--) {
					b[j][4 - i] = a[i][j];
				}
			}




		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
			System.out.println();
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("  "+ b[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		//답2번  = 책답
		int k;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		


			k = 0;
			for (i = 4; i >= 0; i--) {
				for (j = i; j <= 4; j++) {
					k++;
					a[i][j] = k;
				}
			}
			for (i = 0; i <= 4; i++) {
				for (j = 0; j <= 4; j++) {
					b[j][4 - i] = a[i][j];
				}
			}

	
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
			System.out.println();
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("  "+ b[i][j]);
			}
			System.out.println();
		}

		
	}
}
