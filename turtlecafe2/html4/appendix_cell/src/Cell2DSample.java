/*
 * Cell2DSample.java
 * 2次元セルオートマトンのサンプルプログラム
 * Created on 2011/12/18
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell2DSample extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell2DSample());
	}

	public void start() {
		window.setKameSpeed("very fast");
		window.setSize(800, 600);
		hide();

		int cellCount = 11;// 縦横のマスの数

		CellTurtle ct = new CellTurtle(10);

		// 種を作る
		ct.right(cellCount / 2);
		ct.fd(cellCount / 2);
		ct.mark();
		ct.bk(cellCount / 2);
		ct.left(cellCount / 2);

		// 繰り返して更新する
		while (true) {
			// １ステップの前処理
			sleep(0.1);
			ct.beginNextTurn();

			// １ステップの処理（すべてのマスを書き換える）
			for (int j = 0; j < cellCount; j++) {
				for (int i = 0; i < cellCount; i++) {
					if (ct.isMarked()) {
						ct.flip(2);// 黒白を反転する
						ct.flip(4);
						ct.flip(6);
						ct.flip(8);
					}
					ct.fd(1);
				}
				ct.bk(cellCount);
				ct.right();
			}
			ct.left(cellCount);
		}
	}
}
