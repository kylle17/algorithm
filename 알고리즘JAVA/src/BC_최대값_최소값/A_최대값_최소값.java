package BC_�ִ밪_�ּҰ�;

import java.util.Scanner;

public class A_�ִ밪_�ּҰ� {
	public static void main(String[] args) {
		
		/*    
		 *     10���� ��ġ �ڷḦ �Է� �޾� �迭�� ������ �� ����� �ڷ� �� ���� ū ���� ���Ͻÿ�.
		 */
		
				
		//��1��  = ���� Ǭ��
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10]; int max, min, tmp;		
		for (int i = 0; i < 10; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			n[i] = sc.nextInt();
		}
		max = n[0];
		min = n[0];

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			max = n[0];
			min = n[0];
			for (int i = 0; i < 10; i++) {
				if (n[i] > max) {
					max = n[i];
				}
				if (n[i] < min) {
					min = n[i];
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(max+" , "+min);
		
		
		//��2��  = å��
		int i;
		max = n[0];
		min = n[0];
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		

			max = n[0];
			min=n[0];
			for (i = 0; i <= 9; i++) {
				if (n[i] > max) {
					max = n[i];
				}
				if (n[i] < min) {
					min = n[i];
				}
			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(max+" , "+min);

		
	}
}
