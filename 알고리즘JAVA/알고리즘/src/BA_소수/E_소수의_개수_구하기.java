package BA_�Ҽ�;

public class E_�Ҽ���_����_���ϱ� {
public static void main(String[] args) {
		
		/*
		 * �迭 A[99]�� 2~100 ������ ������ ����Ų �� �� �迭�� �̿��Ͽ� �Ҽ��� ������ ���Ͻÿ�.
		 */
		
				
		//��1��  = ���� Ǭ��
		String resultText = null;

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			
			int A[] = new int[99]; int result=0;
			for (int i = 0; i < 99; i++) {
				A[i] = i + 2;
			}

			for (int i = 0; i < 99; i++) {
				int j = 2;
				while (true) {
					if (j <= Math.sqrt(A[i])) {
						if (A[i] % j == 0) {
							break;
						}
						else {
							j++;
						}
					}
					else {
						result += 1;
						break;
					}
				}
			}

			resultText = Integer.toString(result);
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//��2��  = å��
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		


			int k, i, j, m;
			int a[] = new int[99];

			k = 1;
			do {
				k++;
				a[k - 2] = k;
			} while (k<100);

			i = -1; j = 0;
			while (true) {
				i++;
				if (i > 98) {
					break;
				}
				if (a[i] == 0)
					continue;
				j++;
				m = i;
				while (true) {
					m += a[i];
					if (m > 98)
						break;
					a[m] = 0;

				}

			}
			resultText = Integer.toString(j);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
