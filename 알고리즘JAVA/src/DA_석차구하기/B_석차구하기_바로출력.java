package DA_�������ϱ�;

import java.util.Scanner;

public class B_�������ϱ�_�ٷ���� {
	public static void main(String[] args) {
		
		/*    
		 *    10���� �л��� ����, ���� ������ ���� �Է¹޾� ������ ����� �� 
		 *    ���� ���� ������������ ������ ����Ͻÿ�.
		 *    ��, ������ �������� �ϰ� ������ 0�ΰ��� ������� �ʴ´�. 
		 */
		
		
		//��1��  = ���� Ǭ��
		Scanner sc = new Scanner(System.in);
		int kor[] = new int[10], math[] = new int[10], total[] = new int[10];;
		int i , j , k , rank;

		for (i = 0; i < 10; i++) {
			kor[i] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			math[i] = sc.nextInt();
		}

		for (i = 0; i < 10; i++) {
			total[i] = kor[i] + math[i];
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			


			for (i = 0; i < 10; i++) {
				rank = 1;
				for ( j= 0; j < 10; j++) {
					if (total[i] < total[j]) {
						rank++;
					}
				}
			}

		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);

		
		
		
		
		
		
		//��2��  = å��
		int r=0;
	
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		


			i = -1;
			for (i = 0; i <= 9; i++) {
				if (total[i] != 0) {
					r = 1;
					for (j = 0; j <= 9; j++) {
						if (total[i] < total[j])
							r++;
					}
				}
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);

		
	}
}
