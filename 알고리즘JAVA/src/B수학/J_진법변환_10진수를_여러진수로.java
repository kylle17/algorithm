package B����;

import java.util.Scanner;

public class J_������ȯ_10������_���������� {
	public static void main(String[] args) {
		
		/*    
		 *     10������ 2����, 8����, 16���� �� �� ������ ��ȯ�� �������� �Է¹޾� ��ȯ�ؼ� ����Ͻÿ�. 
		 *     ��, ���� ǥ�ÿ� ���� 0~9, A, B, C, D, E, F�� A[16] �迭�� ����Ǿ� �ִٰ� �����Ѵ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
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
