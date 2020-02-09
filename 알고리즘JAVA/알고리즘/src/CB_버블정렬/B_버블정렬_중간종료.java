package CB_버블정렬;

import java.util.Scanner;

public class B_버블정렬_중간종료 {
	public static void main(String[] args) {
		
		/*    
		 *    배열에 기억된 10건의 자료를 오름차순으로 정렬하시오.  
		 *    단, 정렬 수행중 특정 회전에서 정렬을 위한 교환이 한 번도 이루어 지지 않으면
		 *    정렬이 완료된 것이므로 그 때까지의 교환 횟수와 정렬된 자료를 출력하고 끝낸다.     
		 */
		
		
		//답1번  = 내가 푼것
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
		System.out.print("소요시간(m) : "+runtime/1000.0);
		System.out.println("교환 횟수: "+ total_cnt);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		
		
		
		
		
		
		//답2번  = 책답
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
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		System.out.println("교환 횟수:  "+ cnt);
		for (int x = 0; x <= 9; x++)
			System.out.print(data[x]);

		
	}
}
