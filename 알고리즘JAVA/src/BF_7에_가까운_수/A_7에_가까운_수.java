package BF_7��_�����_��;

import java.util.Scanner;

public class A_7��_�����_�� {
	
	// static ������ ������ �ش�. 
	public static int FIND = 7;
	
	public static void main(String[] args) {
		
		/*    
		 *          10���� 1�ڸ� ���� ������ �Է� �޾� �迭�� ������ ��   
		 *          ����� �ڷ� �� 7�� ���� ����� �ڷḦ ã���ÿ�.
		 *          ��, �ڷ�� 1�ڸ� �����̰� �ٻ簪�� 2���� ��쿡�� ���߿� ã�� ���� ����Ѵ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
		int a[] = new int[10]; int num , gap , tmp, result;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		result = 0;
		num = 7;
		gap = 10;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	


			num = 7;
			gap = 10;
			
			for (int i = 0; i < 10; i++) {
				if (a[i] >= num) {
					tmp = a[i] - num;
				}
				else {
					tmp = num - a[i];
				}
				if (tmp < gap) {
					result = a[i];
					gap = tmp;
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		//��2��  = å��
		int i, j, k, L, m;
		m = 0;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			j = 9;
			for (k = 0; k <= 9; k++) {
				if (a[k] >= FIND)
					L = a[k] - FIND;
				else
					L = FIND - a[k];
				if (L <= j) {
					j = L;
					m = a[k];
				}
			}

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(m);

		
	}
}
