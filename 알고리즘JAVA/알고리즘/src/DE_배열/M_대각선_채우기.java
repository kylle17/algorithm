package DE_�迭;

public class M_�밢��_ä��� {
	public static void main(String[] args) {
		
	
		
		//��1��  = ���� Ǭ��
		int a[][] = new int[5][5];
		int n = 0 , s=-1 , e=0 , i ,j , x, y; 
	
		
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			n = 0 ; s=-1 ; e=0;
			for (i = 0; i < 9; i++) {
				if (i < 5) {
					e++;
					x = -1;
					y = e;
				}
				else {
					e--;
					s++;
					x = s;
					y = 5;
				}
				for (j = 0; j < e; j++) {
					n++;
					x++;
					y--;
					a[x][y] = n;
				}
			}


		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}


		
		
		
		
		
		//��2��  = å��
		int k;
		int L = 0;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		


			L = 0;
			for (i = 0; i <= 8; i++) {
				for (j = 0; j <= 4; j++) {
					k = i - j;
					if (k < 0) {
						continue;
					}
					if (k > 4) {
						continue;
					}
					L++;
					a[j][k] = L;
				}
			}
	
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}


		
	}
}
