package BH_�׷����ڵ�;

import java.util.Scanner;

public class A_�׷����ڵ� {
	public static void main(String[] args) {
		
		/*    
		 *           0 �Ǵ� 1�� �ԷµǴ� �ټ� ���� ���ڸ� �迭�� �Է� �޾�
		 *           �׷��� �ڵ� �Ǵ� �������� ��ȯ�Ͻÿ�. 
		 */
		
		
		//��1��  = ���� Ǭ��
		int a[] = new int[5];  int result[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			result[0] = a[1];

			if (a[0] == 0) {
				for (int i = 1; i < 4; i++) {
					if (a[i] == a[i+1]) {
						result[i] = 0;
					}
					else {
						result[i] = 1;
					}
				}
			}
			else {
				for (int i = 1; i < 4; i++) {
					if (result[i - 1] == a[i+1]) {
						result[i] = 0;
					}
					else {
						result[i] = 1;
					}
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		if (a[0] == 0) {
			System.out.print("�׷��� �ڵ�: ");
		}
		else {
			System.out.print("������: ");
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(result[i]);
		}
		System.out.println();
		
		//��2��  = å��
		int i;
		int cont[] = new int[4];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		




			cont[0] = a[1];

			if (a[0] == 1) {
				for (i = 0; i <= 2; i++) {
					if (a[i + 2] == cont[i])
						cont[i + 1] = 0;
					else
						cont[i + 1] = 1;
				}
			}
			else {
				for (i = 0; i <= 2; i++) {
					if (a[i + 1] == a[i + 2])
						cont[i + 1] = 0;
					else
						cont[i + 1] = 1;
				}
			}



			
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		if (a[0] == 1)
			System.out.println("������ ");
		else
			System.out.println("�׷����ڵ�");
		for (i = 0; i <= 3; i++)
			System.out.print(cont[i]);

		
	}
}
