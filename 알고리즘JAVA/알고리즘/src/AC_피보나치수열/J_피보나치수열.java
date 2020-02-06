package AC_피보나치수열;

public class J_피보나치수열 {
	public static void main(String[] args) {
		
		// 1!+2!+3!+4!+...+10!  합계를 구하시오.
		
		
		
		//답1번 
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 0;	int a = 1;	int b = 1;	int c = 0;	int sum = 2;
			
			while(i<18) {
				i++;
				c = a+b;
				sum += c;				
				a = b;
				b = c;				
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		//답2번 
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int a = 1;	int b = 1;	int c = 0;	int sum = 2;
			
			for(int i=3 ; i<=20 ; i++) {
				c = a+b;
				sum += c;				
				a = b;
				b = c;				
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
