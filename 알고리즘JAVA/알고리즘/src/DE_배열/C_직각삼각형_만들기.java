package DE_배열;

public class C_직각삼각형_만들기 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				n++;
				a[i][j] = n;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("     "+a[i][j]);
			}
			System.out.println();
		}
	}
}
