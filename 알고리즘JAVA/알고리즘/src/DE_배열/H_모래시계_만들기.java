package DE_배열;

import java.util.Scanner;

public class H_모래시계_만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		int a[][] = new int[x][x];
		int n = 0, s = 0, e = x , m=x/2;
		sc.close();
		
		for (int i = 0; i < x; i++) {
			for (int j = s; j < e; j++) {
				n++;
				a[i][j] = n;
			}
			if (i < m) {
				s++;
				e--;
			}
			else {
				s--;
				e++;
			}
		}

		for (int i = 0; i <x ; i++) {
			for (int j = 0; j <x ; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
