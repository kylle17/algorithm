package BA_소수;

import java.util.Scanner;

public class H_소인수_분해하기 {
	public static void main(String[] args) {
		
		/*
		 * 정수를 입력 받아 소인수를 구해 출력하 시오. 
		 */
		
				
		//답1번  = 내가 푼것
		int n, i, cnt,  mok, nmg, judge;	int result[]= new int[100];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cnt = -1;
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			


			cnt = 0;
			mok = n;
			judge = 0;
			while (true) {
				i = 2;
				while (true) {
					if (i <= Math.sqrt(mok)) {
						if (mok%i == 0) {
							break;
						}
						else {
							i++;
						}
					}
					else {
						result[cnt] = mok;
						judge = 1;
						break;
					}
				}

				if (judge == 1) {
					break;
				}

				for (int j = 2; j <= Math.sqrt(mok); j++) {
					if (mok%j == 0) {
						mok /= j;
						result[cnt] = j;
						cnt++;
						break;
					}
				}
			}



			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println( n );
		for( i=0 ; i<=cnt ; i++) {
			System.out.print(result[i]);
		}
		
		//답2번  = 책답
		
		int b, c, d, e ;
		int a[] = new int[100];		
		b = n;
		c = -1;
		mok=0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
	

			c = -1;
			b = n;
			while (true) {
				d = 2;
				e = (int)Math.sqrt(b);

				while (true) {
					if (d > e) {
						d = b;
						break;
					}
					mok = b / d;
					nmg = b - mok * d;
					if (nmg == 0)
						break;
					else
						d++;
				}
				c++;
				a[c] = d;
				if (b == d)
					break;
				b = mok;
				}


			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(n);
		for (i = 0; i <= c; i++) {
			System.out.print(a[i]);
		}
		
	}
}
