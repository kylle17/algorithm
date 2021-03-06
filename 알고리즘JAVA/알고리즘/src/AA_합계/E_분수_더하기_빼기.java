package AA_합계;

public class E_분수_더하기_빼기 {
	public static void main(String[] args) {
		
		//    -(½)+(⅔)- … -(99/100)  합계를 구하시오.
		
		
		
		//답1번 = 내가 적은 답.
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			float i = 0;
			int sw = -1;
			float sum = 0;
			while(i<100) {
				sw *= -1;
				sum += i/(++i)*sw;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		
		//답2번 = 스위치 사용하기
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			  float i = 0 ;  float sum = 0; int sw = 0;
			  while (i<99) {
				  i++;
				  if(sw==0) {
					  sum -= i/(i+1);
					  sw = 1;
				  }else {
					  sum += i/(i+1);
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
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			  float i = 0 ;  float sum = 0;
			  while (true) {
				  i++;
				  sum -= i/(i+1);
				  if(i>=99) break;
				  i++;
				  sum += i/(i+1);				  
			  }
			  if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
		
		
		//답4번 = 홀수 특성 활용하기
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
            float i = 0 ;  float sum = 0; 
            while(i<99){
                  i++;
                  if(i%2==0) {
                        sum += i/(i+1);
                  }else {
                        sum -= i/(i+1);
                  }
            }
			  if(repeat==1) System.out.println(sum);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		
	}
}
