package DE_�迭;

public class B_�⺻_5��5��_�������ຯȭ {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n;
		
		n=0;
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				n++;
				a[j][i] = n;
			}
		}
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.print("   "+a[i][j]);
			}
			System.out.println();
		}
	}
}
