package DE_�迭;

import java.util.Scanner;

public class F_���ڷ�_ä��� {
	public static void main(String[] args) {
		
	
		
		//��1��  = ���� Ǭ��
		int a[][] = new int[5][5];
		int n=0 , sw=0;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			n=0;
			sw=0;
			for (int i = 0; i <= 4; i++) {
				if (sw == 0) {
					sw = 1;
					for (int j = 0; j <= 4; j++) {
						n++;
						a[i][j] = n;
					}
				}
				else {
					sw = 0;
					for (int j = 4; j >= 0; j--) {
						n++;
						a[i][j] = n;
					}
				}
			}



		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		//��2��  = å��
		int k, L, m, i, j, p;

		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			k = 0;
			L = 0;

			m = 4;
			n = 1;
			for (i = 0; i <= 4; i++) {
				for (j = L; j != m + n; j += n) {
					k++;
					a[i][j]=k;
				}
				p = L;
				L = m;
				m = p;
				n *= -1;
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (int x = 0; x <= 4; x++) {
			for (int y = 0; y <= 4; y++) {
				System.out.print(" "+ a[x][y]);
			}
			System.out.println();
		}

		
	}
}
