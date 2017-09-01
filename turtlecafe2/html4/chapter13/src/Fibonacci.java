/*
 * Fibonacchi.java
 * フィボナッチ数列を計算するプログラム
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Fibonacci extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Fibonacci());
	}

	public void start() {
		print("fib(1) = " + fib(1));
		print("fib(2) = " + fib(2));
		print("fib(3) = " + fib(3));
		print("fib(4) = " + fib(4));
		print("fib(5) = " + fib(5));
		print("fib(6) = " + fib(6));
		print("fib(7) = " + fib(7));
	}

	int fib(int n) {
		int value;
		if (n == 1) {
			value = 1;
		} else if (n == 2) {
			value = 2;
		} else {
			value = fib(n - 1) + fib(n - 2);
		}
		return value;
	}

}				