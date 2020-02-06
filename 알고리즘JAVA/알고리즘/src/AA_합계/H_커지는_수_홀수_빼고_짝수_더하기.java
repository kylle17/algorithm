package AA_합계;

public class H_커지는_수_홀수_빼고_짝수_더하기 {
	public static void main(String[] args) {
		
		// -1+2-4+7-11+16-22+...  20번쨰 항까지 합계를 구하시오.
		
		
		
		//답1번 = 내가 적은 답.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			int i = 0;	int j = 1;	int sw = -1;	int sum = -1;
			
			while(i<19) {
				i++;
				j += i;
				sw *= -1;
				sum += j*sw;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		
		//답2번 = 스위치 사용하기
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			  int i = 0 ;  int j = 1; int sum = -1; int sw = 0;
			  
			  while (i<19) {
				  i++;
				  j+= i;
				  if(sw==0) {
					  sum += j;
					  sw = 1;
				  }else {
					  sum -= j;
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
		
			  int i = 0 ;  int j = 1 ;	int sum = -1;
			  
			  while (true) {
				  i++;
				  j += i;
				  sum += j;
				  if(i>=19) break;
				  i++;
				  j += i;
				  sum -= j;				  
			  }
			  if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
