package AA_�հ�;

public class H_Ŀ����_��_Ȧ��_����_¦��_���ϱ� {
	public static void main(String[] args) {
		
		// -1+2-4+7-11+16-22+...  20���� �ױ��� �հ踦 ���Ͻÿ�.
		
		
		
		//��1�� = ���� ���� ��.
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
		
		
		//��2�� = ����ġ ����ϱ�
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
		
		
		//��3�� = ������ ���� �ݺ����
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
	}
}
