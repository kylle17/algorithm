package 수열;

public class G커지는수더하기2 {
	public static void main(String[] args) {
		
		//    1+3+6+10+15+21+28+... 20번째 항까지 합계를 구하시오.

		
		
		
		//답1번 = 내가 적은 답 = 책답
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			int i = 0;
			int j = 0;
			int sum = 0;
			while(i<20) {
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
