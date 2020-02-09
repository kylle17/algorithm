package CB_버블정렬;

public class C_버블정렬_좌우번갈아정렬 {
	public static void main(String[] args) {
		
		/*    
		 *      버블 정렬 기법을 응용하여 
     	 *		한 번은 왼쪽에서 오른쪽으로 진행하면서 최대값을 우측으로 보내고,
     	 *		한 번은 오른쪽에서 왼쪽으로 진행하면서 최소값을 좌측으로 보내는 방식으로 정렬하시오.   
		 */
		
		
		//답1번  = 내가 푼것
		int z[] = { 8,5,6,2,4,1,3,7,9,10 };
		int a[] = new int[10];
		int i, k, cnt, sw, tmp;
		cnt = 0;
		i = 0;
		k = 0;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	

			for(i=0 ; i<10 ; i++) {
				a[i] = z[i];
			}
			cnt = 0;
			i = 0;
			k = 0;
			while (true) {
				sw = 0;
				for (int j = 0 + k; j < 9 - i; j++) {
					if (a[j] > a[j + 1]) {
						tmp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = tmp;
						cnt++;
						sw = 1;
					}
				}
				i++;
				for (int j = 9 - i; j >= 1 + k; j--) {
					if (a[j] < a[j - 1]) {
						tmp = a[j];
						a[j] = a[j - 1];
						a[j - 1] = tmp;
						cnt++;
						sw = 1;
					}
				}
				i++;
				k++;
				if (sw == 0) {
					break;
				}
			}


			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println("교환 횟수: "+ cnt);
		for ( i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		
		
		
		
		
		
		//답2번  = 책답
		int n, shift, left, right, buf;
		int d[] = new int[10];
		cnt = 0;
		shift=0;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			cnt = 0;
			shift=0;
			for(i=0 ; i<10 ; i++) {
				d[i] = z[i];
			}
			n = 9;
			left = 0;
			right = n;
			while (left < right) {
				for (i = left; i <= right - 1; i++) {
					if (d[i] > d[i + 1]) {
						buf = d[i];
						d[i] = d[i + 1];
						d[i + 1] = buf;
						shift = i;
						cnt++;
					}
				}
				right = shift;
				for (i = right; i >= left + 1; i--) {
					if (d[i - 1] > d[i]) {
						buf = d[i - 1];
						d[i - 1] = d[i];
						d[i] = buf;
						shift = i;
						cnt++;
					}
				}
				left = shift;
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println("교환 횟수:  "+ cnt);
		for (int x = 0; x <= 9; x++)
			System.out.print(d[x]);

		
	}
}
