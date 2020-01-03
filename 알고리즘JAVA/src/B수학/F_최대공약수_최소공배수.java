package B수학;

import java.util.Scanner;

public class F_최대공약수_최소공배수 {
public static void main(String[] args) {
		
		/*
		 * 두 수를 입력 받아 두 수의 최대공약수와 최소공배수를 계산해서 출력하시오. 
		 */
		
				
		//답1번  = 내가 푼것
		String resultText = null;
		int a, b, i, big, small, mok, nmg, gcm, lcm;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<1000000 ; repeat++) {	
			

			
			if (a > b) {
				i = a;
			}
			else {
				i = b;
			}
			while (true) {
				if (a%i == 0 && b%i == 0) {
					gcm = i;
					break;
				}
				else {
					i--;
				}
			}
			
			if (a > b) {
				i = a;
			}
			else {
				i = b;
			}
			while (true) {
				if (i%a == 0 && i%b == 0) {
					lcm= i;
					break;
				}
				else {
					i++;
				}
			}

			resultText = Integer.toString(gcm)+" , "+Integer.toString(lcm);
			
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
		
		//답2번  = 책답
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<1000000 ; repeat++) {		
		


			if (a > b) {
				big = a;
				small = b;
			}
			else {
				big = b;
				small = a;
			}

			while (true) 
			{
				mok = big / small;
				nmg = big - mok * small;
				if (nmg == 0)
				{
					gcm = small;
					lcm = a * b / gcm;
					resultText = Integer.toString(gcm,lcm);
					break;
				}
				big = small;
				small = nmg;
			}
			resultText = Integer.toString(gcm)+" , "+Integer.toString(lcm);
		
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("소요시간(m) : "+runtime/1000.0);
		System.out.println(resultText);
		
	}
}
