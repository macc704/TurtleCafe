/*
 * 回文判定さん
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class HanteiSan extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HanteiSan());
	}

	// タートルを動かす処理
	public void start() {
		print(check("こんにちは"));
		print(check("あいうえお"));
		print(check("とまと"));
		print(check("たけやぶやけた"));
	}

	boolean check(String bun) {
		String hantenbun = makeHantenbun(bun);
		boolean result = bun.equals(hantenbun);
		return result;
	}

	String makeHantenbun(String bun) {
		int len = bun.length();
		String hantenbun = "";
		for (int i = len - 1; i >= 0; i--) {
			char c = bun.charAt(i);
			hantenbun = hantenbun + c;
		}
		return hantenbun;
	}
}
