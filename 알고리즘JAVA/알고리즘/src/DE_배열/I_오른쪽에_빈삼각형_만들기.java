package DE_�迭;

import java.util.Scanner;

public class I_�����ʿ�_��ﰢ��_����� {
	public static void main(String[] args) {
		
	
		
		//��1��  = ���� Ǭ��
		int a[][] = new int[7][7];
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		int n = 0,  e = x , m=x/2;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			n = 0;  e = x ; m=x/2;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < e; j++) {
					n++;
					a[i][j] = n;
				}
				if (i < m) {
					e--;
				}
				else {
					e++;
				}
			}





		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		for (int i = 0; i < x ; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		//��2��  = å��
		int k, i, j, L;
		m=0;

		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			


			k = 0; i=0; j=0; L=0;
			m = x / 2;

			for (i = 0; i <= x - 1; i++) {
				if (i < m) {
					L = x - i;
				}
				else {
					L = i + 1;
				}
				for (j = 0; j <= L - 1; j++) {
					k++;
					a[i][j] = k;
				}
			}

		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (i = 0; i < x ; i++) {
			for (j = 0; j < x; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}

		
	}
}
