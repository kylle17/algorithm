package B����;

import java.util.Scanner;

public class J_������ȯ_10������_���������� {
	public static void main(String[] args) {
		
		/*    
		 *     10������ 2����, 8����, 16���� �� �� ������ ��ȯ�� �������� �Է¹޾� ��ȯ�ؼ� ����Ͻÿ�. 
		 *     ��, ���� ǥ�ÿ� ���� 0~9, A, B, C, D, E, F�� A[16] �迭�� ����Ǿ� �ִٰ� �����Ѵ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
		int n, b, e, mok, nmg, cnt;
		char sign[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
		char result[] = new char[10];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		b = sc.nextInt();
		e = 1;
		mok = n;
		cnt = -1;
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			e = 1;
			mok = n;
			cnt = -1;
			while (e <= n) {
				e *= b;
			}

			while (true) {
				e /= b;
				nmg = mok % e;
				mok /= e;
				cnt++;
				result[cnt] = sign[mok];
				mok = nmg;
				if (e == 1) {
					break;
				}
			}


			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println( n );
		for(int i = 0; i <= cnt; i++) {
			System.out.print(result[i]);
		}
		
		//��2��  = å��
		
		int c, d, f;
		char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
		c = n;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
	
			c = n;
			d = 1;
			while (d<=c) {
				d *= b;
			}
			while (true) {
				if (d > 1)
					d /= b;
				e = c / d;
				f = c - e * d;
				

				if (d != 1)
					c = f;
				else
					break;
			}

			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(n);

		
	}
}
