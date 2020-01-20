package CA_선택정렬;

import java.util.Scanner;

public class A_선택정렬 {
	public static void main(String[] args) {
		
		/*    
		 *           10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료를 오름차순으로 정렬하시오.
		 */
		
		
		//답1번  = 내가 푼것
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
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		//답2번  = 책답
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
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (x = 0; x <= 9; x++) {
			System.out.print(" "+data[x]+" ");
		}
		System.out.println();

		
	}
}
