package BE_배수_합계;

public class A_5의_배수_개수와_합계 {
	public static void main(String[] args) {
		
		/*    
		 *     7명의 채점 점수 중에서 최하위 점수와 최상위 점수를 제외한 5명 점수의 평균을 구하시오.
		 *     단, 7명의 채점 점수는 배열에 들어 있다. 
		 */
		
				
		//답1번  = 내가 푼것
		int cnt=0, sum=0;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			cnt=0; sum=0;

			for (int i = 1; i <= 100; i++) {
				if (i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(cnt+","+sum);
		
		
		//답2번  = 책답
		int hap, mok, nmg, i;
		cnt = 0; hap = 0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			cnt = 0; hap = 0;

			for (i = 1; i <= 100; i++) {
				mok = i / 5;
				nmg = i - 5 * mok;
				if (nmg == 0) {
					cnt++;
					hap += i;
				}
			}

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(cnt+","+hap);

		
	}
}
