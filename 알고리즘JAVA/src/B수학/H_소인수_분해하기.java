package B수학;

import java.util.Scanner;

public class H_소인수_분해하기 {
	public static void main(String[] args) {
		
		/*
		 * 10진수를 입력 받아 2진수로 변환하시오. 
		 * 단, 1000 이하의 숫자를 입력받는다.
		 */
		
				
		//답1번  = 내가 푼것
		int n, cnt, mok, nmg;	int result[]= new int[100];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cnt = -1;
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			
			mok = n;
			cnt = -1;
			while (true) {
				if (mok < 2) {
					cnt++;
					result[cnt] = mok;
					break;
				}
				else {
					cnt++;
					nmg = mok % 2;
					mok /= 2;
					result[cnt] = nmg;
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println( n );
		for(int i=cnt ; i>=0 ; i--) {
			System.out.print(result[i]);
		}
		
		//답2번  = 책답
		
		int b, bb, c, i;
		int a[] = new int[100];		
		b = n;
		bb = b;		
		c = -1;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
	
			b = n;
			bb = b;
			c = -1;
			do {
				c++;
				mok = b / 2;
				nmg = b - mok * 2;
				a[c] = nmg;
				b = mok;
			} while (mok!=0);

			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(bb);
		for (i = c; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
	}
}
