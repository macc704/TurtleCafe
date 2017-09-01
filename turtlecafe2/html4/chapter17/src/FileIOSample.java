/*
 * ファイル読み書きのテスト
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class FileIOSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FileIOSample());
	}

	// タートルを動かす処理
	public void start() {
		saveToFile("a.txt", "ほげ");
		print(loadFromFile("a.txt"));
	}
}
