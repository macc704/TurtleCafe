/*
 * 反転さん　反転文を作る
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class HantenSan extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HantenSan());
	}

	// タートルを動かす処理
	public void start() {
		print(makeHantenbun("こんにちは"));
		print(makeHantenbun("あいうえお"));
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
