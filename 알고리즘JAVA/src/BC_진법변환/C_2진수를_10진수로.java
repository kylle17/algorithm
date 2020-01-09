package BC_진법변환;

import java.util.Scanner;

public class C_2진수를_10진수로 {
	public static void main(String[] args) {
		
		/*    
		 *     10자리로 구성된 2진수를 입력받아 10진수로 변환하여 출력하시오.  
		 *     단, 10자리 2진수는 문자열로 되어 있고,      
		 *        5번째 자리까지는 소수 이상이고, 
		 *        6번째 자리부터 10번째 자리까지는 소수 이하를 의미한다.
		 */
		
				
		//답1번  = 내가 푼것
		String n = null; int b; double f, result = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			
			result = 0;
			b = 4;	
			for (int i = 0; i < n.length();i++) {
				f = (n.charAt(i)-'0');
				result += Math.pow(2, b)*f;
				b--;
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println( n );
		System.out.println(result);
		
		//답2번  = 책답
		
		
		double d, e;
		result = 0;
		int c = -1;
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		

			result = 0;
			c = -1;
			while(true)
			{
				c++;
				if (c < n.length()) {
					d = n.charAt(c)-'0';;
					e = d * Math.pow(2, 4 - c);
					result += e;
				}
				else {
					break;
				}

			}
			
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println(n);
		System.out.println(result);

		
	}
}
