package 수열;

public class B홀수합계 {
	public static void main(String[] args) {
		
		//1 ~ 100까지 홀수 합계를 구하시오.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 1;
			int sum = 0;
			while(i<99) {
				i += 2;
				sum += i;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
	}
}
