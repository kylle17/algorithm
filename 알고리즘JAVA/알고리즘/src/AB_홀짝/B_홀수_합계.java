package AB_Ȧ¦;

public class B_Ȧ��_�հ� {
	public static void main(String[] args) {
		
		//1 ~ 100���� Ȧ�� �հ踦 ���Ͻÿ�.
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
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
	}
}
