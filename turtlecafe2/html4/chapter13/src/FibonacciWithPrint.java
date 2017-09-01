/*
 * Fibonacchi.java
 * フィボナッチ数列を計算するプログラム(プリント付き)
 * Created on 2011/12/18 macchan
 * Revised on 2012/12/18 macchan
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FibonacciWithPrint {

	public static void main(String[] args) {
		FibonacciWithPrint fibonacciWithPrint = new FibonacciWithPrint();
		fibonacciWithPrint.run();
	}

	public void run() {
		System.out.print("fib(5, 0) = " + fib(5, 0));
	}

	int fib(int n, int indentCount) {
		printStart(n, indentCount);
		int value;
		if (n == 1) {
			value = 1;
		} else if (n == 2) {
			value = 2;
		} else {
			value = fib(n - 1, indentCount + 1) + fib(n - 2, indentCount + 1);
		}
		printEnd(value, indentCount);
		return value;
	}

	void printStart(int length, int indentCount) {
		makeIndent(indentCount);
		System.out.print("fib(" + length + ", " + indentCount + ")");
		System.out.println("");
	}

	void printEnd(int result, int indentCount) {
		makeIndent(indentCount);
		System.out.print("// return " + result);
		System.out.println("");
	}

	void makeIndent(int indentCount) {
		for (int i = 0; i < indentCount; i++) {
			System.out.print("\t");
		}
	}

}