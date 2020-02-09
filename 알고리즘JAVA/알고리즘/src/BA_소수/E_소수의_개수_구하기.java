package BA_소수;

public class E_소수의_개수_구하기 {
public static void main(String[] args) {
		
		/*
		 * 배열 A[99]에 2~100 사이의 정수를 기억시킨 후 이 배열을 이용하여 소수의 개수를 구하시오.
		 */
		
				
		//답1번  = 내가 푼것
		String resultText = null;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			
			int A[] = new int[99]; int result=0;
			for (int i = 0; i < 99; i++) {
				A[i] = i + 2;
			}

			for (int i = 0; i < 99; i++) {
				int j = 2;
				while (true) {
					if (j <= Math.sqrt(A[i])) {
						if (A[i] % j == 0) {
							break;
						}
						else {
							j++;
						}
					}
					else {
						result += 1;
						break;
					}
				}
			}

			resultText = Integer.toString(result);
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		


			int k, i, j, m;
			int a[] = new int[99];

			k = 1;
			do {
				k++;
				a[k - 2] = k;
			} while (k<100);

			i = -1; j = 0;
			while (true) {
				i++;
				if (i > 98) {
					break;
				}
				if (a[i] == 0)
					continue;
				j++;
				m = i;
				while (true) {
					m += a[i];
					if (m > 98)
						break;
					a[m] = 0;

				}

			}
			resultText = Integer.toString(j);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
