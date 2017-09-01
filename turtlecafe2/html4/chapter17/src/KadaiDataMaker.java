import java.util.Random;

/*
 * ファイル読み書きのテスト
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class KadaiDataMaker extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new KadaiDataMaker());
	}

	String[] names = new String[] { "佐藤", "鈴木", "田中", "橋本", "高橋", "渡辺", "伊藤",
			"山本" };

	// タートルを動かす処理
	public void start() {
		Random r = new Random();
		String text = "名前,数学,英語\n";
		for (int i = 0; i < names.length; i++) {
			int score1 = (int) ((r.nextGaussian() + 1d) * 20d) + 20;
			if (score1 > 100) {
				score1 = 100;
			}
			int score2 = (int) ((r.nextGaussian() + 1d) * 15d) + 40;
			if (score2 > 100) {
				score2 = 100;
			}
			text += names[i] + "," + score1 + "," + score2;
			text += "\n";
		}
		saveToFile("score.txt", text);
		// print(loadFromFile("a.txt"));
	}
}
