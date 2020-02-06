package DE_배열;

public class E_직각삼각형만들기_오른쪽부터채우기 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n=0;
		
		for(int i=0 ; i<=4 ; i++) {
			for(int j=i ; j>=0 ; j--) {
				n++;
				a[i][j] = n;
			}
		}
		
		for(int i=0 ; i<=4 ; i++) {
			for(int j=0 ; j<=4 ; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
