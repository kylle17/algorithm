package BG_����_���ϱ�;

import java.util.Scanner;

public class C_������_����_��_���ϱ� {
	public static void main(String[] args) {
		
		/*    
		 *      2�� ������ ǥ���� ���� 2�� ������ ���Ͻÿ�. 
		 */
		
		
		//��1��  = ���� Ǭ��
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.print("�Է��Ѽ�: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n����:");
		for (int i = 0; i < 5; i++) {
			System.out.print(result[i]);
		}
		System.out.println();
		
		
		//��2��  = å��
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
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.print("�Է��Ѽ�: ");
		for (i = 0; i < 5; i++) {
			System.out.print(a[i]);			
		}
		System.out.print("\n����:");
		for (i = 0; i < 5; i++) {
			System.out.print(b[i]);
		}

		
	}
}
