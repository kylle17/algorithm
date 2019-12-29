package A수열;

public class L분모가커지는수합계 {
	public static void main(String[] args) {
		
		// 1 + 1/2 + 1/3 + 1/4 + ... + 1/10을 구하시오.
		
		
		
		//답1번  = 내가 푼것
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			float result = 1;
			
			for(int i = 1  ; i<= 10 ; i++) {				
				result += 1/(float)i;
			}
			if(repeat==1) System.out.println(result);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			float hap=1 ; float a=1; float d=0;
			do {
				d = 1 / a;
				hap += d;
				a++;				
			}while(a<=10);
			if(repeat==1) System.out.println(hap);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
