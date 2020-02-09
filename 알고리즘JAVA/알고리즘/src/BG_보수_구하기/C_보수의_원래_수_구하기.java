package BG_보수_구하기;

import java.util.Scanner;

public class C_보수의_원래_수_구하기 {
	public static void main(String[] args) {
		
		/*    
		 *      2의 보수로 표현된 값의 2의 보수를 구하시오. 
		 */
		
		
		//답1번  = 내가 푼것
		int a[] = new int[5];  int result[] = new int[5];
		int e = 1;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			e=1;
			for (int i = 4; i >= 0; i--) {
				if (e == 1) {
					result[i] = 1 - (1-a[i]);
					e = 1 - a[i];
				}
				else {
					result[i] = 1 - a[i];
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
		int b[] = new int[5];
		int i, c;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		


			c = 1;
			for (i = 4; i >= 0; i--) {
				b[i] = a[i] - c;
				if (a[i] == 0 && c == 1)
					c = 1;
				else
					c = 0;
				b[i] = Math.abs(b[i]);
			}
			for (i = 0; i <= 4; i++)
				b[i] = 1 - b[i];

			
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
