package DE_�迭;

public class E_�����ﰢ�������_�����ʺ���ä��� {
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
