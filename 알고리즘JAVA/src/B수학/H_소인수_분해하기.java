package B����;

import java.util.Scanner;

public class H_���μ�_�����ϱ� {
	public static void main(String[] args) {
		
		/*
		 * 10������ �Է� �޾� 2������ ��ȯ�Ͻÿ�. 
		 * ��, 1000 ������ ���ڸ� �Է¹޴´�.
		 */
		
				
		//��1��  = ���� Ǭ��
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println( n );
		for(int i=cnt ; i>=0 ; i--) {
			System.out.print(result[i]);
		}
		
		//��2��  = å��
		
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
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(bb);
		for (i = c; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
	}
}
