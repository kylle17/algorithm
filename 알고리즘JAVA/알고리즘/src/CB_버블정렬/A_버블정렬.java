package CB_��������;

import java.util.Scanner;

public class A_�������� {
	public static void main(String[] args) {
		
		/*    
		 *    �迭�� ���� 10���� �ڷḦ ������������ �����Ͻÿ�.        
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


			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 9 - i;j++) {
					if (a[j] > a[j + 1]) {
						tmp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = tmp;
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
		int i, j, k;
		int data[] = new int[10];
		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		

			
			for(i=0 ; i<10 ; i++) {
				data[i] = n[i];
			}
			i = -1;
			do {
				i++;
				j = -1;
				do {
					j++;
					if (data[j] > data[j + 1]) {
						k = data[j];
						data[j] = data[j + 1];
						data[j + 1] = k;
					}
				} while (j<8-i);
			} while (i < 8);
			
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (int x = 0; x <= 9; x++) {
			System.out.print(" "+data[x]+" ");
		}
		System.out.println();

		
	}
}
