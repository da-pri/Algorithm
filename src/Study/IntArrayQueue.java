package Study;

import java.util.Random;

public class IntArrayQueue {
	private int[] que; // 큐
	private int capacity; // 큐의 크기
	private int front;
	private int rear;
	private int num; // 현재 데이터 개수
	public boolean state = true;

	public IntArrayQueue(int maxlen) { // 생성자
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			System.out.println("empty 발생");
			state = true;
		}
	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			System.out.println("full 발생");
			state = false;
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[num - 1];

	}

	public static void main(String[] args) {
		IntArrayQueue arr = new IntArrayQueue(20); // 최대 20개를 푸시할 수 있는 큐
		for (int i = 1; i <= 100; i++) {
			if (arr.state) {
				try {
					arr.enque((int) (Math.random() * 100)); // 랜덤 수가 100이하인 정수
					System.out.println("[" + i + "] " + arr.peek() + "인큐 ( front = " + arr.front + ", rear = "
							+ arr.rear + ", num = " + arr.num + " )");
				} catch (IntArrayQueue.OverflowIntQueueException e) {
					i--;
				}
			} else {
				try {
					System.out.println(arr.deque() + " 디큐");
					i--;
				} catch (IntArrayQueue.EmptyIntQueueException e) {
					i--;
				}
			}
		}
	}
}
