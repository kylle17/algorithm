package 수열;

public class F커지는수더하기 {
	public static void main(String[] args) {
		
		//    1+2+4+7+11+16+22+... 20번째 항까지 합계를 구하시오.

		
		
		
		//답1번 = 내가 적은 답 = 책답
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			int i = 0;
			int j = 1;
			int sum = 1;
			while(i<19) {
				i++;
				j += i;
				sum += j;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);		
		
	}
}
