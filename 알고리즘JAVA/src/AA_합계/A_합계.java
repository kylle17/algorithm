package AA_합계;

public class A_합계 {
	public static void main(String[] args) {
		
		//1 ~ 100까지 합계를 구하시오.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 0;
			int sum = 0;
			while(i<100) {
				i++;
				sum += i;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
	}
}
