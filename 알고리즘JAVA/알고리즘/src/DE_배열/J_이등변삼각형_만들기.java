package DE_�迭;

import java.util.Scanner;

public class J_�̵�ﰢ��_����� {
	public static void main(String[] args) {
		
	
		
		//��1��  = ���� Ǭ��
		int x,y;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=x*2-1;
		int a[][] = new int[y][x];
		int n = 0, m = y / 2, s = m , e = m;
		sc.close();
	
		long startTime = System.currentTimeMillis(); 		
		for(int repeat=0 ; repeat<100000000 ; repeat++) {	



			n = 0; m = y / 2; s = m ; e = m;		
			for (int i = 0; i <= x-1; i++) {
				for (int j =s ; j <= e; j++) {
					n++;
					a[j][i] = n;
				}
				s--;
				e++;
			}


		
		}        
		long endTime = System.currentTimeMillis(); 
		long runtime = (endTime - startTime); 
		System.out.println("�ҿ�ð�(m) : "+runtime/1000.0);
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		//��2��  = å��
		int col; 
		int row;
		int k, j, L, i;
		col=x;
		row = col * 2 - 1;


		
		
		startTime = System.currentTimeMillis(); 
		for(int repeat=0 ; repeat<100000000 ; repeat++) {		
			

			k = 0;
			for (j = 0; j <= col - 1; j++) {
				L = col - (j + 1);
				e = (j - 1) + col;
				for (i = L; i <= e; i++) {
					k++;
					a[i][j] = k;
				}
			}

		
				
		}        
		endTime = System.currentTimeMillis(); 
		runtime = (endTime - startTime); 
		System.out.println("\n�ҿ�ð�(m) : "+runtime/1000.0);
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		
	}
}
