package B����;

import java.util.Scanner;

public class A�Ҽ��Ǻ� {
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
		System.out.println(n);
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<10000000 ; repeat++) {	
			
			int i = 1; 
			while(true) {				
				i++;
				if(n%i==0) {
					resultText = n+"�� �Ҽ��� �ƴմϴ�.";
					break;
				}
				if(i>=n-1) {  //�������� �ѹ��� Ȯ���ϰ� �ϴ� ���� ����. ������ �ݺ��ؼ� Ȯ���ϸ� ��ȿ�����̴�.
					          // n-1�� �ִ� �� ���ٴ� ������ ����� �ְ� ������ ����ϴ°� ����. �Ź� ����ؼ� Ȯ���ϸ� ��ȿ�����̴�. 
					resultText = n+"�� �Ҽ� �Դϴ�.";		
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
		
			int i; int j;
			i = n-1;
			j = 2;
			while(true) {
				if(j<=i) {
					if(n%j==0) {
						resultText = "�Ҽ� �ƴ�";
						break;
					}else {
						j++;
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
