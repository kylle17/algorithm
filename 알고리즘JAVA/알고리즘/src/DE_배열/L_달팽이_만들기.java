package DE_배열;

public class L_달팽이_만들기 {
	public static void main(String[] args) {
		int k, c, i, j, f, n;
		int a[][] = new int[5][5];

		k = 0;
		c = 1;
		i = 0;
		j = -1;

		f = 5;
		while (true) {
			for (n = 1; n <= f; n++) {
				k++;
				j += c;
				a[i][j] = k;
			}
			f--;
			if (f <= 0) {
				break;
			}
			for (n = 1; n <= f; n++) {
				k++;
				i += c;
				a[i][j] = k;
			}
			c *= -1;
		}
		for (int x = 0; x <= 4; x++) {
			for (int y = 0; y <= 4; y++) {
				System.out.print(" "+ a[x][y]);
			}
			System.out.println();
		}
	}
}
