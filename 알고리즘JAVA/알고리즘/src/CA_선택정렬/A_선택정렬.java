package CA_��������;

import java.util.Scanner;

public class A_�������� {
	public static void main(String[] args) {
		
		/*    
		 *           10���� ��ġ �ڷḦ �Է� �޾� �迭�� ������ �� ����� �ڷḦ ������������ �����Ͻÿ�.
		 */
		
		
		//��1��  = ���� Ǭ��
		int n[] = new int[10]; int a[]= new int[10] ; int tmp;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	

			for(int i=0 ; i<10 ; i++) {
				a[i] = n[i];
			}
			for (int i = 0; i < 9; i++) {
				for (int j = i+1; j < 10; j++) {
					if (a[i] > a[j]) {
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
			}



			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		//��2��  = å��
		int m, i, j, k, x;
		int data[] = new int[10];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		

			
			for(i=0 ; i<10 ; i++) {
				data[i] = n[i];
			}
			i = -1;
			do {
				i++;
				j = i;
				do {
					j++;
					if (data[i] > data[j]) {
						k = data[i];
						data[i] = data[j];
						data[j] = k;
					}
				} while (j < 9);
			} while (i < 8);
			
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (x = 0; x <= 9; x++) {
			System.out.print(" "+data[x]+" ");
		}
		System.out.println();

		
	}
}
