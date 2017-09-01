/*
 * 作文さん
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class SakubunSan extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SakubunSan(), args);
	}

	// タートルを動かす処理
	public void start() {
		// 名詞を読み込む
		String nountxt = loadFromFile("Noun.txt");
		String[] nouns = nountxt.split("\n");
		int nounSize = nouns.length;

		// 動詞を読み込む
		String verbtxt = loadFromFile("Verb.txt");
		String[] verbs = verbtxt.split("\n");
		int verbSize = verbs.length;

		for (int i = 0; i < 10; i++) {
			// 作文する
			String noun1 = nouns[random(nounSize)];// 名詞1を選ぶ
			String noun2 = nouns[random(nounSize)];// 名詞2を選ぶ
			String verb = verbs[random(verbSize)];// 動詞を選ぶ
			print(noun1 + "が" + noun2 + "に" + verb);
		}
	}
}
