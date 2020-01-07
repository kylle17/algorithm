package B수학;

import java.util.Scanner;

public class J_진법변환_10진수를_여러진수로 {
	public static void main(String[] args) {
		
		/*    
		 *     10진수와 2진수, 8진수, 16진수 중 몇 진수로 변환할 것인지를 입력받아 변환해서 출력하시오. 
		 *     단, 진수 표시에 사용될 0~9, A, B, C, D, E, F는 A[16] 배열에 저장되어 있다고 가정한다. 
		 */
		
				
		//답1번  = 내가 푼것
		int n, cnt, mok, nmg;	int result[]= new int[100];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cnt = -1;
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			
			int b, c, d, e, f;
			char a[16] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

			scanf_s("%d %d", &b, &c);
			d = 1;
			while (d<=c) {
				d *= b;
			}
			while (1) {
				if (d > 1)
					d /= b;
				e = c / d;
				f = c - e * d;
				System.out.println(a[e]);

				if (d != 1)
					c = f;
				else
					break;
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
