package AA_합계;

public class K_커지는_수와_작아지는_수_곱해서_더하기 {
	public static void main(String[] args) {
		
		// (77 x 1) + (76 x 2) + (75 x 3) + ... + (2 x 76) + (1 x 77)를 구하시오. 
		
		
		
		//답1번  = 내가 푼것
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int n = 77;	int result = 0;
			
			for(int i=1 ; i<=77 ; i++) {
				result += i*n;
				n -= 1;
			}
			if(repeat==1) System.out.println(result);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int p=0 ; int q=0; int m=0; int h=0;
			
			do {
				p++;
				q = 78-p;
				m = p*q;
				h += m;
			}while(p<77);
			if(repeat==1) System.out.println(h);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
