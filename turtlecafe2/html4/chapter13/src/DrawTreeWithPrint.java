/*
 * DrawTreeWithPrint.java
 * 再帰を使って木を描くプログラム(プリント付き)
 * Created on 2011/12/18 macchan
 * Revised on 2012/12/18 macchan
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class DrawTreeWithPrint extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTreeWithPrint());
	}

	// タートルを動かす処理
	public void start() {
		window.size(500, 500);
		warp(250, 400); // 木を描く位置まで移動する

		drawY(50, 0);
	}

	// Yを描く
	void drawY(int length, int indentCount) {
		printStart(length, indentCount);

		if (length < 5) {// 再帰の終点
			printEnd(indentCount);
			return;
		}

		fd(length);// 幹を描く

		// 左の枝を描く
		lt(30);
		fd(length / 2);
		drawY(length / 2, indentCount + 1);
		bk(length / 2);
		rt(30);

		// 右の枝を描く
		rt(30);
		fd(length / 2);
		drawY(length / 2, indentCount + 1);
		bk(length / 2);
		lt(30);

		bk(length);// 幹の根元に戻る

		printEnd(indentCount);
	}

	void printStart(int length, int indentCount) {
		makeIndent(indentCount);
		System.out.print("drawY(" + length + ", " + indentCount + ")");
		System.out.println("");
	}

	void printEnd(int indentCount) {
		makeIndent(indentCount);
		System.out.print("//");
		System.out.println("");
	}

	void makeIndent(int indentCount) {
		for (int i = 0; i < indentCount; i++) {
			System.out.print("\t");
		}
	}

}