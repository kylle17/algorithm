package CC_��������;

import java.util.Scanner;

public class A_�������� {
	public static void main(String[] args) {
		
		/*    
		 *           10���� ��ġ �ڷḦ �Է� �޾� �迭�� ������ ��
		 *           ����� �ڷḦ ������������ �����Ͻÿ�.  
		 */
		
		
		//��1��  = ���� Ǭ��
		int z[] = new int[10];
		int a[] = new int[10];
		int tmp=0, j=0, cnt=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			z[i] = sc.nextInt();
		}		
		sc.close();
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	

			
			j=0;
			cnt=0;
			tmp=0;
			for(int i=0 ; i<10 ; i++) {
				a[i] = z[i];
			}
			for (int i = 1; i < 10; i++) {
				tmp = a[i];
				j = 0;
				for (j = i - 1; j >= 0; j--) {
					if (tmp < a[j]) {
						a[j + 1] = a[j];
						cnt++;
					}
					else {
						break;
					}
				}
				a[j + 1] = tmp;
			}

		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println("Ƚ��: "+ cnt);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		
		
		
		
		
		
		//��2��  = å��
		int i, k, key;
		cnt = 0;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			for(i=0 ; i<10 ; i++) {
				a[i] = z[i];
			}
			cnt=0;
			for (i = 1; i <= 9; i++) {
				key = a[i];
				for (k = i - 1; k >= 0; k--) {
					if (a[k] > key) {
						a[k + 1] = a[k];
						cnt++;
					}
					else
						break;
				}
				a[k + 1] = key;
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println("��ȯ Ƚ��:  "+ cnt);
		for (int x = 0; x <= 9; x++)
			System.out.print(a[x]);

		
	}
}
