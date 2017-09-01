/*
 * CellSample.java
 * 1次元セルオートマトンのサンプルプログラム
 * Created on 2011/12/16
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell1DSample extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell1DSample());
	}

	public void start() {
		window.setSize(800, 600);
		hide();

		// セルタートル, 赤いタートル　初期位置(10, 10) 右向き
		CellTurtle ct = new CellTurtle(10);// 大きさ10

		// 種の行を書く
		ct.fd(10);
		ct.mark();
		ct.bk(10);
		ct.right(1);

		// 五行の処理を行う
		for (int j = 0; j < 5; j++) {
			// 一行の処理を行う
			for (int i = 0; i < 20; i++) {
				if (!ct.isMarked(7) && !ct.isMarked(4) && ct.isMarked(1)) {
					ct.mark();
				}
				ct.fd(1);
			}
			ct.bk(20);
			ct.right(1);
		}
	}
}
