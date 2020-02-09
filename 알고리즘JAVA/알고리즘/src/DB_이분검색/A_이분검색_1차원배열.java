package DB_�̺а˻�;

import java.util.Scanner;

public class A_�̺а˻�_1�����迭 {
	public static void main(String[] args) {
		
		/*    
		 *	Ű����� �Է� ���� ���� DATA �迭�� �� ��°�� ���Ǿ� �ִ��� ����Ͻÿ�.
		 *	�� DATA[10] �迭���� 10���� ���ڰ� ��� ������,
		 *	ã�� �ڷᰡ ���� ��� �ڷ�� �Բ� "Not Found"�� ����ϰ� ������. 
		 */
		
		
		//��1��  = ���� Ǭ��
		int data[] = {8,15,35,55,60,61,70,80,92,99};
		int a, n, start, end;
		String result=null;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			start = 0;
			end = 9;
			n = 0;
			while (true) {
				if (start > end) {
					result = "Not Found";
					break;
				}
				n = (start + end) / 2;
				if (a == data[n]) {
					result = n+"�� �迭�� �ֽ��ϴ�.";
					break;
				}
				else if (a < data[n]) {
					end = n - 1;
				}
				else {
					start = n + 1;
				}		
			}

		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		
		
		
		//��2��  = å��
		int j, L, h, m;
		j = a;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			L = 0;
			h = 9;
			while (true) {
				if (L <= h) {
					m = (L + h) / 2;
					if (j == data[m]) {
						result = m+"�� �迭�� �ֽ��ϴ�.";
						break;
					}
					if (j < data[m])
						h = m - 1;
					else
						L = m + 1;
				}
				else
				{
					result = "Not Found";
					break;
				}
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(result);

		
	}
}
