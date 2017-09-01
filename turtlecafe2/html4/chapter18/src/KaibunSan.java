/*
 * 回文さん
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class KaibunSan extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new KaibunSan(), args);
	}

	// タートルを動かす処理
	public void start() {
		// 名詞を読み込む
		String nountxt = loadFromFile("NounYomi.txt");
		String[] nouns = nountxt.split("\n");
		int nounSize = nouns.length;

		// 動詞を読み込む
		String verbtxt = loadFromFile("VerbYomi.txt");
		String[] verbs = verbtxt.split("\n");
		int verbSize = verbs.length;

		for (int i = 0; i < 1000000; i++) {
			// 作文し，回文ができたら表示する
			String noun1 = nouns[random(nounSize)];
			String verb = verbs[random(verbSize)];
			String bun1 = noun1 + verb;
			if (check(bun1)) {
				print(noun1 + "-" + verb);
			}
		}

		print("finished");
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
