package BC_������ȯ;

import java.util.Scanner;

public class C_2������_10������ {
	public static void main(String[] args) {
		
		/*    
		 *     10�ڸ��� ������ 2������ �Է¹޾� 10������ ��ȯ�Ͽ� ����Ͻÿ�.  
		 *     ��, 10�ڸ� 2������ ���ڿ��� �Ǿ� �ְ�,      
		 *        5��° �ڸ������� �Ҽ� �̻��̰�, 
		 *        6��° �ڸ����� 10��° �ڸ������� �Ҽ� ���ϸ� �ǹ��Ѵ�.
		 */
		
				
		//��1��  = ���� Ǭ��
		String n = null; int b; double f, result = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			
			result = 0;
			b = 4;	
			for (int i = 0; i < n.length();i++) {
				f = (n.charAt(i)-'0');
				result += Math.pow(2, b)*f;
				b--;
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println( n );
		System.out.println(result);
		
		//��2��  = å��
		
		
		double d, e;
		result = 0;
		int c = -1;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		

			result = 0;
			c = -1;
			while(true)
			{
				c++;
				if (c < n.length()) {
					d = n.charAt(c)-'0';;
					e = d * Math.pow(2, 4 - c);
					result += e;
				}
				else {
					break;
				}

			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(n);
		System.out.println(result);

		
	}
}
