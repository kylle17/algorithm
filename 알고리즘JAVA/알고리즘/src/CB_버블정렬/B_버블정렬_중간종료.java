package CB_��������;

import java.util.Scanner;

public class B_��������_�߰����� {
	public static void main(String[] args) {
		
		/*    
		 *    �迭�� ���� 10���� �ڷḦ ������������ �����Ͻÿ�.  
		 *    ��, ���� ������ Ư�� ȸ������ ������ ���� ��ȯ�� �� ���� �̷�� ���� ������
		 *    ������ �Ϸ�� ���̹Ƿ� �� �������� ��ȯ Ƚ���� ���ĵ� �ڷḦ ����ϰ� ������.     
		 */
		
		
		//��1��  = ���� Ǭ��
		int n[] = new int[10]; 
		int a[] = new int[10];
		int tmp, cnt , total_cnt;
		total_cnt = 0;
		cnt = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		sc.close();
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	

			for(int i=0 ; i<10 ; i++) {
				a[i] = n[i];
			}
			total_cnt = 0;
			
			for (int i = 0; i < 9; i++) {
				cnt = 0;
				for (int j = 0; j < 9 - i; j++) {
					if (a[j] > a[j + 1]) {
						tmp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = tmp;
						cnt++;
					}
				}		
				if (cnt == 0) {
					break;
				}
				total_cnt += cnt;
			}
			

			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.print("�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println("��ȯ Ƚ��: "+ total_cnt);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		
		
		
		
		
		
		//��2��  = å��
		int i, j, sw, k;
		int data[] = new int[10];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		

			cnt=0;
			for(i=0 ; i<10 ; i++) {
				data[i] = n[i];
			}
			cnt = 0;
			for (i = 1; i <= 9; i++) {
				sw = 0;
				for (j = 0; j <= (9 - i); j++) {
					if (data[j] > data[j + 1]){
						k = data[j];
						data[j] = data[j + 1];
						data[j + 1] = k;
						cnt++;
						sw = 1;
						}
				}
				if (sw == 0)
					break;
			}

			
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		System.out.println("��ȯ Ƚ��:  "+ cnt);
		for (int x = 0; x <= 9; x++)
			System.out.print(data[x]);

		
	}
}
