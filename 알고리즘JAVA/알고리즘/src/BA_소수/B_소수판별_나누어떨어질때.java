package BA_�Ҽ�;

import java.util.Scanner;

public class B_�Ҽ��Ǻ�_����������� {
public static void main(String[] args) {
		
		/*
		 * �Ҽ� �Ǻ�
		 * �Ҽ��� 1���� ũ�� 1�� �ڱ� �ڽŸ��� ����� ������ ���� �ǹ��մϴ�. 
		 * (1���� Ŀ�� �ϱ� ������ 1�� �Ҽ��� �ƴϴ�. )
		 */
		
				
		//��1��  = ���� Ǭ��
		int n; String resultText = null;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n);
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			
			int i = 2; 
			while(true) {				
				if(i*i <= n) { //i�� ��ȭ�� �� ���� ����ϴ� ������ �ؾ� �ϱ� ������ sqrt�� ����ϴ� �� ���� ��ȿ�� ���̴�. 
					if(n%i==0) {
						resultText = "�Ҽ� �ƴ�";
						break;
					}else {
						i++;
					}					
				}else {
					resultText = "�Ҽ�";
					break;
				}
			}		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//��2��  = å��
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 2; 
			while(true) {				
				if(i <= Math.sqrt(n)) {
					if(n%i==0) {
						resultText = "�Ҽ� �ƴ�";
						break;
					}else {
						i++;
					}					
				}else {
					resultText = "�Ҽ�";
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
