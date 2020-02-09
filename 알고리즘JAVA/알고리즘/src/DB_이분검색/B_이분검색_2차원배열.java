package DB_�̺а˻�;

import java.util.Scanner;

public class B_�̺а˻�_2�����迭 {
	public static void main(String[] args) {
		
		/*    
		 *	Ű����� �Է� ���� ���� DATA �迭�� �� ��°�� ���Ǿ� �ִ��� ����Ͻÿ�.
		 *	�� DATA[10] �迭���� 10���� ���ڰ� ��� ������,
		 *	ã�� �ڷᰡ ���� ��� �ڷ�� �Բ� "Not Found"�� ����ϰ� ������. 
		 */
		
		
		//��1��  = ���� Ǭ��
		int data[][] = {
			{1,2,3,4,5,6,7,8,9,10},
			{100,66,25,88,90,65,87,86,58,99}
		};
		int a, n,start, end;
		String result=null;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			start = 0;
			end = 9;
			while (true) {
				if (start <= end) {
					n = (start + end) / 2;
					if (a < data[0][n]) {
						end = n - 1;
					}
					else if(a > data[0][n]) {
						start = n + 1;
					}
					else {
						result = (" "+data[1][n]);
						break;
					}
				}
				else {
					result = "Not Found";
					break;
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
					if (j == data[0][m]) {
						result = (" "+ data[1][m]);
						break;
					}
					if (j < data[0][m])
						h = m - 1;
					else
						L = m + 1;
				}
				else {
					result = " Not Found";
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
