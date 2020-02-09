package BJ_������_���ϱ�;

import java.util.Scanner;

public class A_������_���ϱ� {
	public static void main(String[] args) {
		
		/*    
		 *            
		 */
		
		
		//��1��  = ���� Ǭ��
		int x[] = new int[10]; int y[] = new int[10]; int result[] = new int[10] ;
		int plus;
		plus = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���\n");
		for (int i = 0; i < 10; i++) {
			x[i] = sc.nextInt();
		}
		System.out.println("���ڸ� �Է��ϼ���\n");
		for (int i = 0; i < 10; i++) {
			y[i] = sc.nextInt();
		}
		sc.close();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	



			for (int i = 9; i >= 0 ; i--) {
				result[i] = x[i] + y[i] + plus;
				plus = result[i] / 2;
				result[i] %= 2;
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		if (plus == 1) {
			System.out.println("OVERFLOW");		
		}
		else {
			for (int i = 0; i < 10; i++) {
				System.out.print(result[i]);
			}
		}
		System.out.println();
		
		
		
		
		
		
		//��2��  = å��
		int z, c, j;
		int a[] = new int[10];
		z = 0; c = 0; j = 9;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		

			
			z = 0; c = 0; j = 9;
			do {
				z = x[j] + y[j] + c;
				if (z < 2) {
					c = 0;
					a[j] = z;
				}
				else {
					c = 1;
					a[j] = z - 2;
				}
				j--;
			} while (j >= 0);

			
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		if (c == 0) {
			do {
				j++;
				System.out.print(a[j]);
			} while (j < 9);
		}
		else {
			System.out.println("OVERFLOW");
		}
		System.out.println();

		
	}
}
