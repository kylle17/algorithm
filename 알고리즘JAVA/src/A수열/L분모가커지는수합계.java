package A����;

public class L�и�Ŀ���¼��հ� {
	public static void main(String[] args) {
		
		// 1 + 1/2 + 1/3 + 1/4 + ... + 1/10�� ���Ͻÿ�.
		
		
		
		//��1��  = ���� Ǭ��
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			float result = 1;
			
			for(int i = 1  ; i<= 10 ; i++) {				
				result += 1/(float)i;
			}
			if(repeat==1) System.out.println(result);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
		
		//��2��  = å��
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<10000000 ; repeat++) {		
		
			float hap=1 ; float a=1; float d=0;
			do {
				d = 1 / a;
				hap += d;
				a++;				
			}while(a<=10);
			if(repeat==1) System.out.println(hap);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
	}
}
