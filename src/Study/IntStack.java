package Study;

import java.util.Scanner;

public class IntStack {
	private int[] stk;
	private int capacity;
	private int ptr;

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public void dump() {
		if(ptr <= 0)
			System.out.println("stack이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i]+"");
			System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		IntStack stack = new IntStack(10);

		for (;;) {

			Scanner sc = new Scanner(System.in);
			System.out.print("(1)푸시 (2)팝 (3)피크 (0)종료, 선택하세요 : ");
			int menu = sc.nextInt();
			int x = 0;

			if (menu == 0)
				return;

			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				stack.push(x);
				break;
			case 2:
				try {
					x = stack.pop();
					System.out.println("pop한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					e.printStackTrace();
					System.out.println("stack이 비어 있어서 pop를 할 수 없습니다.");
				} break;
			case 3:
				try {
					x = stack.peek();
					System.out.println("peek한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("stack이 비어 있어서 peek를 할 수 없습니다.");
					e.printStackTrace();
				}
				break;
			case 4:
				stack.dump();
				break;
			}
		}

	}

}