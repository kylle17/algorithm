package DE_배열;

public class A_기본_5행5열 {
	public static void main(String[] args) {
		int i, j, k;
		int a[][] = new int[5][5];

		k = 0;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				k++;
				a[i][j] = k;
			}
		}

		for (int x = 0; x <= 4; x++) {
			for (int y = 0; y <= 4; y++) {
				System.out.print(" "+a[x][y]);
			}
			System.out.println();
		}
	}
}
