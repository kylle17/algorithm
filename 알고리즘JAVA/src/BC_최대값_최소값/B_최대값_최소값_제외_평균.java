package BC_�ִ밪_�ּҰ�;

import java.util.Scanner;

public class B_�ִ밪_�ּҰ�_����_��� {
	public static void main(String[] args) {
		
		/*    
		 *     7���� ä�� ���� �߿��� ������ ������ �ֻ��� ������ ������ 5�� ������ ����� ���Ͻÿ�.
		 *     ��, 7���� ä�� ������ �迭�� ��� �ִ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
		Scanner sc = new Scanner(System.in);
		int a[] = new int[7]; int result=0 , max, min;		
		for (int i = 0; i < 7; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			a[i] = sc.nextInt();
		}
		max = a[0];
		min = a[0];
		result = 0;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			max = a[0];
			min = a[0];
			result = 0;
			for (int i = 0; i < 7; i++) {
				result += a[i];
				if (a[i] > max) {
					max = a[i];
				}
				if (a[i] < min) {
					min = a[i];
				}
			}
			result = (result - max - min)/5;

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		//��2��  = å��
		int hap, avg, i;
		max = a[0];
		min = a[0];
		hap = a[0];
		avg=0;
		i = 0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			min = a[0];
			max = a[0];
			hap = a[0];
			i = 0;

			while (i < 6) {
				i++;
				hap += a[i];
				if (a[i] < min)
					min = a[i];
				if (a[i] > max)
					max = a[i];
			}
			hap = hap - min - max;
			avg = hap / 5;

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(min+" , "+ max +" , "+ hap +" , "+ avg);

		
	}
}
