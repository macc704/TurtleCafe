/*
 * Factorial.java
 * ŠKæ‚ğŒvZ‚·‚éƒvƒƒOƒ‰ƒ€
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Factorial extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Factorial());
	}

	public void start() {
		print("factorial(1) = " + factorial(1));
		print("factorial(2) = " + factorial(2));
		print("factorial(3) = " + factorial(3));
		print("factorial(4) = " + factorial(4));
		print("factorial(5) = " + factorial(5));
	}

	int factorial(int n) {
		int result;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}

}				