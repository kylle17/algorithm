package DC_병합;

public class A_병합 {
	
	static int i, j, k;  //책답용 변수;
	static void BB(int b[], int c[]) {
		if (b[j] == 0)
			DD(c);
		do {
			k++;
			c[k] = b[j];
			j++;
		} while (b[j] != 0);
		DD(c);
	}

	static void CC(int a[], int c[]) {
		do {
			k++;
			c[k] = a[i];
			i++;
		} while (a[i] != 0);
		DD(c);
	}

	static void DD(int c[]) {
		k++;
		c[k] = 0;
	}
	
	public static void main(String[] args) {
		
		/*    
		 *	1. 배열 A , B에는 정수가 오름차순으로 정렬되어 있다.
     	 *	2. 데이터는 10건 미만이다. 
     	 *	3. 배열 A , B에서 0이 들어 있는 다음의 요소에는 데이터가 없는 것으로 간주한다. 
     	 *	4. 배열 A , B를 병합시켜 배열 C에 기억시키고 맨 마지막에는 0을 기억시킨다.
     	 *	5. 배열 A와 B에 같은 데이터가 있으면 한 번만 C에 옮긴다. 
		 */
		
		
		//답1번  = 내가 푼것
		int a[] = {2,3,5,8,9,10,12,13,0,0};
		int b[] = {1,3,5,6,0,0,0,0,0,0};
		int c[] = new int[20];
		int n, sw, numA, numB, numC;
		
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	


			sw = 0;
			numA = 0;
			numB = 0;
			numC = 0;
			n = b[0];
			while (true) {
				if (sw == 0) {
					if (n>a[numA]) {
						c[numC] = a[numA];
						numC++;
						numA++;
					}
					else if (n==a[numA]){
						c[numC] = a[numA];
						numC++;
						numA++;
						numB++;
						n = a[numA];
						sw = 1;
					}
					else {
						n = a[numA];
						sw = 1;
					}
					if (a[numA] == 0) {
						sw = 3;
					}
				}
				else if(sw==1) {
					if(n>b[numB]){
						c[numC] = b[numB];
						numC++;
						numB++;
					}
					else if(n==b[numB]){
						c[numC] = b[numB];
						numC++;
						numA++;
						numB++;
						n = b[numB];
						sw = 0;
					}
					else {
						n = b[numB];
						sw = 0;
					}
					if (b[numB] == 0) {
						sw = 2;
					}
				}
				else if(sw==2) {
					while (true) {
						if (a[numA] == 0) {
							break;
						}
						c[numC] = a[numA];
						numC++;
						numA++;
					}
					break;
				}
				else if (sw == 3) {
					while(true){
						if (b[numB] == 0) {
							break;
						}
						c[numC] = b[numB];
						numC++;
						numB++;
						break;
					}
				}
			}




		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i < 20; i++) {
			System.out.print(" "+c[i]);
		}
		System.out.println();
		
		
		
		
		
		//답2번  = 책답

		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			
			
			i = 0;
			j = 0;
			k = -1;

			while (true) {
				k++;
				if (a[i] < b[j]) {
					c[k] = a[i];
					i++;
					if (a[i] == 0)
						BB(b, c);
				}
				else if (a[i] == b[j]) {
					c[k] = a[i];
					i++;
					j++;
					if (a[i] == 0)
						BB(b, c);
					else if (b[j] == 0) {
						CC(a, c);
						break;
					}
				}
				else {
					c[k] = b[j];
					j++;
					if (b[j] == 0) {
						CC(a, c);
						break;
					}
						
				}
			}
		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n소요시간(m) : "+runtime/1000.0);
		for (int i = 0; i < 20; i++) {
			System.out.print(" "+c[i]);
		}
		System.out.println();

		
	}

}


