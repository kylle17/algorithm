package ����;

public class FĿ���¼����ϱ� {
	public static void main(String[] args) {
		
		//    1+2+4+7+11+16+22+... 20��° �ױ��� �հ踦 ���Ͻÿ�.

		
		
		
		//��1�� = ���� ���� �� = å��
		long startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		
			int i = 0;
			int j = 1;
			int sum = 1;
			while(i<19) {
				i++;
				j += i;
				sum += j;
			}
			if(repeat==1) System.out.println(sum);
		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);		
		
	}
}
