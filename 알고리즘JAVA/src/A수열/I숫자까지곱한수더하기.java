package A����;

public class I���ڱ������Ѽ����ϱ� {
	public static void main(String[] args) {
		
		// 1!+2!+3!+4!+...+10!  �հ踦 ���Ͻÿ�.
		
		
		
		//��1�� = ���� ���� ��.
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		
	}
}
