package DD_스택;

import java.util.Scanner;

public class A_스택 {
	
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
			System.out.println("작업을 선택하세요.");
			j = sc.nextInt();
			if (j == 1) {
				System.out.println("삽입할 숫자를 입력하세요.:");
				k = sc.nextInt(); 
				i = push(k);
				if (i == -1) break;
			}
			else if (j == 2) {
				i = pop();
				if (i == -1) break;
				else
					System.out.println("제거한 자료는 "+i+"입니다.\n");
			}
			else break;
		}
		if (Top < 0)
			System.out.println("스택에 자료가 없습니다.\n");
		else{
			System.out.println("스택의 자료는 다음과 같습니다 \n");
			for (int i = Top; i >= 0; i--)
				System.out.println(Stack[i]);
	}
	}
}
