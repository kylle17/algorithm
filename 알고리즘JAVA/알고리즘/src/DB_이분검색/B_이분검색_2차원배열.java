package DB_이분검색;

import java.util.Scanner;

public class B_이분검색_2차원배열 {
	public static void main(String[] args) {
		
		/*    
		 *	키보드로 입력 받은 값이 DATA 배열의 몇 번째에 기억되어 있는지 출력하시오.
		 *	단 DATA[10] 배열에는 10개의 숫자가 들어 있으며,
		 *	찾은 자료가 없을 경우 자료와 함께 "Not Found"를 출력하고 끝낸다. 
		 */
		
		
		//답1번  = 내가 푼것
		int data[][] = {
			{1,2,3,4,5,6,7,8,9,10},
			{100,66,25,88,90,65,87,86,58,99}
		};
		int a, n,start, end;
		String result=null;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			start = 0;
			end = 9;
			while (true) {
				if (start <= end) {
					n = (start + end) / 2;
					if (a < data[0][n]) {
						end = n - 1;
					}
					else if(a > data[0][n]) {
						start = n + 1;
					}
					else {
						result = (" "+data[1][n]);
						break;
					}
				}
				else {
					result = "Not Found";
					break;
				}

			}

		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(result);
		
		
		
		
		
		//답2번  = 책답
		int j, L, h, m;
		j = a;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			
			
			L = 0;
			h = 9;
			while (true) {
				if (L <= h) {
					m = (L + h) / 2;
					if (j == data[0][m]) {
						result = (" "+ data[1][m]);
						break;
					}
					if (j < data[0][m])
						h = m - 1;
					else
						L = m + 1;
				}
				else {
					result = " Not Found";
					break;
				}

			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(result);

		
	}
}
