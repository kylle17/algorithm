package B����;

import java.util.Scanner;

public class D_�Ҽ���_��_���ϱ� {
public static void main(String[] args) {
		
		/*
		 * ������ ������ �Է� �޾� �� �ȿ� ���Ե� �Ҽ��� ���� ���Ͻÿ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
		int n; String resultText = null;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n);
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			


			int result=0;
			for (int i = 2; i <= n; i++) {
				int j=2;
				while (true) {
					if (j <= Math.sqrt(i)) {
						if (i%j == 0) {
							break;
						}
						else {
							j++;
						}
					}
					else
					{
						result += i;
						break;
					}			
				}
			}
			resultText = Integer.toString(result);
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//��2��  = å��
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i; int j; int result;
			i = 2;
			result = 0;


			while (true) {
				j = 2;
				while (i % j != 0)
					j++;
				if (i == j) {
					result += i;
				}
				if (i < n) {
					i++;
				}
				else {
					resultText = Integer.toString(result);
					break;
				}
			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
