package BG_����_���ϱ�;

import java.util.Scanner;

public class B_2�Ǻ���_���ϱ�_���2 {
	public static void main(String[] args) {
		
		/*    
		 *      2�� ���� ���� ���ϱ�. 
		 */
		
		
		//��1��  = ���� Ǭ��
		int a[] = { 0,1,0,1,0 }; 
		int result[] = new int[5];
		int sw = 0;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	

			sw=0;
			for (int i = 4; i >= 0; i--) {
				if (sw == 0) {
					if (a[i] == 1) {
						result[i] = a[i];
						sw = 1;
					}else{
						result[i] = a[i];
					}
				}
				else {
					if (a[i] == 0) {
						result[i] = 1;
					}
					else {
						result[i] = 0;
					}
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
		int i, j;
		int b[] = new int[5];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			for (i = 4; i >= 0; i--) {
				if (a[i] == 1)
					break;
				b[i] = a[i];
			}
			for (j = i ; j >= 0; j--)
				b[j] = 1 - a[j];



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
