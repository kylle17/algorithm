package BB_���_�ִ�����_�ּҰ����;

import java.util.Scanner;

public class G_���_���ϱ� {
	public static void main(String[] args) {
		
		/*
		 * ������ �Է� �޾� ����� ���� ����ϴ� �������� �ۼ��Ͻÿ�.  
		 */
		
				
		//��1��  = ���� Ǭ��
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println( n );
		for(int i=0 ; i<cnt ; i++) {
			System.out.print("\t"+result[i]);
		}
		
		//��2��  = å��
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
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println( n );
		for (i = 0; i <= d; i++) {
			System.out.print("\t"+ a[i] );
		}
		
	}
}
