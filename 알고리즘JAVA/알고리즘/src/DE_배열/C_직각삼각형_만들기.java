package DE_�迭;

public class C_�����ﰢ��_����� {
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
