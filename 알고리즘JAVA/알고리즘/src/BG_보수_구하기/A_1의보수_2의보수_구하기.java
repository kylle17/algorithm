package BG_����_���ϱ�;

import java.util.Scanner;

public class A_1�Ǻ���_2�Ǻ���_���ϱ� {
	public static void main(String[] args) {
		
		/*    
		 *      0 �Ǵ� 1�� �ԷµǴ� �ټ� ���� ���ڸ� �迭�� �Է¹޾� 
		 *      1�� ������ 2�� ������ ���Ͻÿ�. 
		 */
		
		
		//��1��  = ���� Ǭ��
		int a[] = new int[5]; 
		int resultA[] = new int[5]; 
		int resultB[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	


			for (int i = 0; i < 5; i++) {
				resultA[i] = 1;
				resultB[i] = 1;
			}
			for (int i = 0; i < 5; i++) {
				resultA[i] -= a[i];
				resultB[i] -= a[i];
			}
			for (int i = 0; i < 5; i++) {
				if (resultB[4 - i] == 1) {
					resultB[4 - i] = 0;
				}
				else {
					resultB[4 - i] += 1;
					break;
				}
			}
			


			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.print("\n�Է��Ѽ�: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n1�Ǻ���: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(resultA[i]);
		}
		System.out.print("\n2�Ǻ���: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(resultB[i]);
		}
		
		
		//��2��  = å��
		int b1[] = new int[5]; 
		int b2[] = new int[5];
		int i = -1, c = 1;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		



			i = -1; c = 1;

			do {
				i++;
				b1[i] = 1 - a[i];
			} while (i < 4);

			do {
				b2[i] = b1[i] + c;
				b2[i] = b2[i] % 2;
				c = b1[i] * c;
				i--;
			} while (i >= 0);


		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.print("\n�Է��Ѽ�: ");
		for (i = 0; i < 5; i++) {
			System.out.print(a[i]);
		}
		System.out.print("\n1�Ǻ���: ");
		for (i = 0; i < 5; i++) {
			System.out.print(b1[i]);
		}
		System.out.print("\n2�Ǻ���: ");
		for (i = 0; i < 5; i++) {
			System.out.print(b2[i]);
		}

		
	}
}
