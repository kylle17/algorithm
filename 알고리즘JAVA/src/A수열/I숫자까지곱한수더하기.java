package A수열;

public class I숫자까지곱한수더하기 {
	public static void main(String[] args) {
		
		// 1!+2!+3!+4!+...+10!  합계를 구하시오.
		
		
		
		//답1번 = 내가 적은 답.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 0;	int j = 1;	int sum = 0;
			
			while(i<10) {
				i++;
				j *= i;
				sum += j;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
