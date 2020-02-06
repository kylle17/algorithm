package DE_배열;

public class G_다이아몬드_만들기 {
	public static void main(String[] args) {
		
	
		
		//답1번  = 내가 푼것
		int a[][] = new int[5][5];
		int n = 0;
		int sw = 0, k = 0;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	



			n = 0; sw = 0; k = 0;
			for (int i = 0; i <= 4; i++) {
				for (int j = 2-k; j <= 2+k; j++) {
					n++;
					a[i][j] = n;
				}
				if (k == 2) {
					sw = 1;
				}
				if (sw==0) {
					k++;
				}
				else {
					k--;
				}
			}


		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		//답2번  = 책답
		int i, j;
		k = 0;
		int s = 2, e = 2;


		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			k = 0;
			s = 2 ; e = 2;
			for (i = 0; i <= 4; i++) {
				for (j = s; j <= e; j++) {
					k++;
					a[i][j] = k;
				}
				if (i >= 2) {
					s++;
					e--;
				}
				else {
					s--;
					e++;
				}
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (int x = 0; x <= 4; x++) {
			for (int y = 0; y <= 4; y++) {
				System.out.print(" "+ a[x][y]);
			}
			System.out.println();
		}

		
	}
}
