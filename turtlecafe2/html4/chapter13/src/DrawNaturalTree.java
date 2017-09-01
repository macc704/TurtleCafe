/*
 * DrawNaturalTree.java
 * 自然な木を描くプログラム
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawNaturalTree extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawNaturalTree());
	}

	// タートルを動かす処理
	public void start() {
		window.size(500, 500);
		warp(250, 400); // 木を描く位置まで移動する

		drawY(50);
	}

	// Yを描く
	void drawY(int length) {

		if (length < 2) {// 再帰の終点
			return;
		}

		fd(length);// 幹を描く

		for (int i = 0; i < 3; i++) {
			int angle = random(90) - 45;
			double len = length * ((random(3) + 6d) / 10d);
			lt(angle);
			fd(len);
			drawY((int) len);
			bk(len);
			rt(angle);
		}

		bk(length);// 幹の根元に戻る
	}

}