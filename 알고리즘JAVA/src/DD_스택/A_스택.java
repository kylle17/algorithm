package DD_����;

import java.util.Scanner;

public class A_���� {
	
	static int Stack[] = new int[5];
	static int Top = -1;

	static int push(int ii) {
		Top++;
		if (Top >= 5) {
			System.out.println("OverFlow\n");
			Top--;
			return-1;
		}
		Stack[Top] = ii;
		return 0;
	}

	static int pop() {
		int r;
		if (Top < 0) {
			System.out.println("Underflow\n");
			return -1;
		}
		r = Stack[Top];
		Top--;
		return r;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int i, j, k;
			System.out.println("�۾��� �����ϼ���.");
			j = sc.nextInt();
			if (j == 1) {
				System.out.println("������ ���ڸ� �Է��ϼ���.:");
				k = sc.nextInt(); 
				i = push(k);
				if (i == -1) break;
			}
			else if (j == 2) {
				i = pop();
				if (i == -1) break;
				else
					System.out.println("������ �ڷ�� "+i+"�Դϴ�.\n");
			}
			else break;
		}
		if (Top < 0)
			System.out.println("���ÿ� �ڷᰡ �����ϴ�.\n");
		else{
			System.out.println("������ �ڷ�� ������ �����ϴ� \n");
			for (int i = Top; i >= 0; i--)
				System.out.println(Stack[i]);
	}
	}
}
