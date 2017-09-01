/*
 * Webファイル読みこみのテスト
 * Created on 2012/01/07
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class WebSample extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WebSample());
	}

	// タートルを動かす処理
	public void start() {
		print(loadFromFile("http://www.inf.shizuoka.ac.jp/", "UTF-8"));
	}
}
