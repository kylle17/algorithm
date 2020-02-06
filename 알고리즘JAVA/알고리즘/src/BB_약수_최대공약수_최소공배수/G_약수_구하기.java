package BB_약수_최대공약수_최소공배수;

import java.util.Scanner;

public class G_약수_구하기 {
	public static void main(String[] args) {
		
		/*
		 * 정수를 입력 받아 약수를 구해 출력하는 순서도를 작성하시오.  
		 */
		
				
		//답1번  = 내가 푼것
		String resultText = null;
		int n;	int cnt=0;  int result[]= new int[100];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			
			cnt=0;
			for (int i=1; i <= n; i++) {
				if (n%i == 0) {
					result[cnt] = i;
					cnt++;
				}
			}
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println( n );
		for(int i=0 ; i<cnt ; i++) {
			System.out.print("\t"+result[i]);
		}
		
		//답2번  = 책답
		int mok, nmg , i;
		int a[] = new int[100];
		int c = 0, d = -1;
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
			
			c=0; d=-1;
			while (true) {
				c++;
				if (c <= n) {
					mok = n / c;
					nmg = n - c * mok;
					if (nmg == 0) {
						d++;
						a[d] = c;
					}
				}
				else {
					break;
				}
			}
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println( n );
		for (i = 0; i <= d; i++) {
			System.out.print("\t"+ a[i] );
		}
		
	}
}
