package BE_���_�հ�;

public class A_5��_���_������_�հ� {
	public static void main(String[] args) {
		
		/*    
		 *     7���� ä�� ���� �߿��� ������ ������ �ֻ��� ������ ������ 5�� ������ ����� ���Ͻÿ�.
		 *     ��, 7���� ä�� ������ �迭�� ��� �ִ�. 
		 */
		
				
		//��1��  = ���� Ǭ��
		int cnt=0, sum=0;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			cnt=0; sum=0;

			for (int i = 1; i <= 100; i++) {
				if (i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(cnt+","+sum);
		
		
		//��2��  = å��
		int hap, mok, nmg, i;
		cnt = 0; hap = 0;
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		


			cnt = 0; hap = 0;

			for (i = 1; i <= 100; i++) {
				mok = i / 5;
				nmg = i - 5 * mok;
				if (nmg == 0) {
					cnt++;
					hap += i;
				}
			}

		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(cnt+","+hap);

		
	}
}
