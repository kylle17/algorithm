package CB_버블정렬;

import java.util.Scanner;

public class A_버블정렬 {
	public static void main(String[] args) {
		
		/*    
		 *    배열에 기억된 10건의 자료를 오름차순으로 정렬하시오.        
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
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+a[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		//답2번  = 책답
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
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (int x = 0; x <= 9; x++) {
			System.out.print(" "+data[x]+" ");
		}
		System.out.println();

		
	}
}
