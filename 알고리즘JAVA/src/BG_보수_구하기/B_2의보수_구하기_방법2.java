package BG_보수_구하기;

import java.util.Scanner;

public class B_2의보수_구하기_방법2 {
	public static void main(String[] args) {
		
		/*    
		 *      2의 보수 쉽게 구하기. 
		 */
		
		
		//답1번  = 내가 푼것
		int a[] = { 0,1,0,1,0 }; 
		int result[] = new int[5];
		int sw = 0;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	

			sw=0;
			for (int i = 4; i >= 0; i--) {
				if (sw == 0) {
					if (a[i] == 1) {
						result[i] = a[i];
						sw = 1;
					}else{
						result[i] = a[i];
					}
				}
				else {
					if (a[i] == 0) {
						result[i] = 1;
					}
					else {
						result[i] = 0;
					}
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.print("입력한수: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n보수:");
		for (int i = 0; i < 5; i++) {
			System.out.print(result[i]);
		}
		System.out.println();
		
		
		//답2번  = 책답
		int i, j;
		int b[] = new int[5];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			for (i = 4; i >= 0; i--) {
				if (a[i] == 1)
					break;
				b[i] = a[i];
			}
			for (j = i ; j >= 0; j--)
				b[j] = 1 - a[j];



		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.print("입력한수: ");
		for (i = 0; i < 5; i++) {
			System.out.print(a[i]);			
		}
		System.out.print("\n보수:");
		for (i = 0; i < 5; i++) {
			System.out.print(b[i]);
		}

		
	}
}
