package AB_홀짝;

public class C_홀수_더하고_짝수_빼기 {
	public static void main(String[] args) {
		
		//1 ~ 100까지 홀수는 더하고 짝수는 뺀 합계를 구하시오.
		
		
		
		//답1번 = 내가 적은 답.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 0;
			int sw = -1;
			int sum = 0;
			while(i<100) {
				i++;
				sw *= -1;
				sum += i*sw;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		
		//답2번 = 스위치 사용하기
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			  int i = 0 ;  int sum = 0; int sw = 0;
			  while (i<100) {
				  i++;
				  if(sw==0) {
					  sum += i;
					  sw = 1;
				  }else {
					  sum -= i;
					  sw = 0;
				  }
			  }
			  if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		
		//답3번 = 순서에 의한 반복계산
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			  int i = 0 ;  int sum = 0;
			  while (i<100) {
				  i++;
				  sum += i;
				  i++;
				  sum -= i;				  
			  }
			  if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
