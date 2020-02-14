package DE_배열;

public class O_행렬변환 {
	public static void main(String[] args) {
		
	
		
		//답1번  = 내가 푼것
		int a[][] = new int[5][3];
		int b[][] = new int[3][5];
		int n =  0 , i, j, k = 0, L = 0;
	
		
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			n =  0 ; k = 0; L = 0;
			for (i = 0; i < 5; i++) {
				for (j = 0; j < 3; j++) {
					n++;
					a[i][j] = n;
				}
			}
			for (i = 0; i < 5; i++) {
				for (j = 0; j < 3; j++) {
					b[k][L] = a[i][j];
					L++;
					if (L > 4) {
						L = 0;
						k++;
					}
				}
			}





		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}


		
		
		
		
		
		//답2번  = 책답
		int row, col,m;

		row = 5; 
		col = 3;
		k = 0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		


			k = 0;
			for (i = 0; i <= row - 1; i++) {
				for (j = 0; j <= col - 1; j++) {
					k++;
					a[i][j] = k;
				}
			}
			L = 0;
			m = -1;
			for (i = 0; i <= row - 1; i++) {
				for (j = 0; j <= col - 1; j++) {
					m += 1;
					b[L][m] = a[i][j];
					if (m >= row - 1) {
						L++;
						m = -1;
					}
				}
			}



	
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" " + b[i][j]);
			}
			System.out.println();
		}


		
	}
}
