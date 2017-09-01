/*
 * DrawTree.java
 * 再帰を使って木を描くプログラム
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawTree extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTree());
	}

	// タートルを動かす処理
	public void start() {
		window.size(500, 500);
		warp(250, 400); // 木を描く位置まで移動する

		drawY(50);
	}

	// Yを描く
	void drawY(int length) {

		if (length < 5) {// 再帰の終点
			return;
		}

		fd(length);// 幹を描く

		// 左の枝を描く
		lt(30);
		fd(length / 2);
		drawY(length / 2);
		bk(length / 2);
		rt(30);

		// 右の枝を描く
		rt(30);
		fd(length / 2);
		drawY(length / 2);
		bk(length / 2);
		lt(30);

		bk(length);// 幹の根元に戻る

	}
}