package DE_배열;

public class N_마방진 {
	public static void main(String[] args) {
		
	
		
		//답1번  = 내가 푼것
		int a[][] = new int[5][5];
		int n = 0 , i=0 , j=2;
	
		
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	



			n = 0 ; i=0 ; j=2;

			while (true) {
				n++;
				a[i][j] = n;
				i--;
				j++;
				if (n % 5 == 0) {
					i += 2;
					j--;
				}
				if (i == -1) {
					i = 4;
				}
				if (j == 5) {
					j = 0;
				}

				if (n == 25) {
					break;
				}
			}



		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}


		
		
		
		
		
		//답2번  = 책답
		int k, nmg;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		





			i = 0;
			j = 5 / 2;

			for (k = 1; k <= 25; k++) {
				a[i][j] = k;
				nmg = k - k / 5 * 5;
				if (nmg == 0) {
					i++;
					continue;
				}
				i--;
				j++;
				if (i < 0) {
					i = 4;
				}
				if (j > 4) {
					j = 0;
				}
			}

	
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}


		
	}
}
