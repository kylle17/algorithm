package DE_배열;

public class B_기본_5행5열_열고정행변화 {
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
