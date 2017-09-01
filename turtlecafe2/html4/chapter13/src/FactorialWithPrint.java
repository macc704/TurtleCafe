/*
 * Factorial.java
 * 階乗を計算するプログラム(プリント付き)
 * Created on 2011/12/18 macchan
 * Revised on 2012/12/18 macchan
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FactorialWithPrint {

	public static void main(String[] args) {
		FactorialWithPrint factorialWithPrint = new FactorialWithPrint();
		factorialWithPrint.run();
	}

	public void run() {
		System.out.println("factorial(5, 0) = " + factorial(5, 0));
	}

	int factorial(int n, int indentCount) {
		printStart(n, indentCount);
		int result;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1, indentCount + 1);
		}
		printEnd(result, indentCount);
		return result;
	}

	void printStart(int length, int indentCount) {
		makeIndent(indentCount);
		System.out.print("factorial(" + length + ", " + indentCount + ")");
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