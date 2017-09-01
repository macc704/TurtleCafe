/*
 * CellSample.java
 * 1次元セルオートマトンのサンプルプログラム
 * Created on 2011/12/16
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */
public class Cell1DSample2 extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new Cell1DSample2());
	}

	public void start() {
		window.setSize(800, 600);
		hide();

		int len = 21;

		// セルタートル, 赤いタートル　初期位置(10, 10) 右向き
		CellTurtle ct = new CellTurtle(10);// 大きさ10

		// 種の行を書く
		ct.fd(len / 2);
		ct.mark();
		ct.bk(len / 2);
		ct.right(1);

		// 五行の処理を行う
		for (int j = 0; j < len; j++) {
			// 一行の処理を行う
			for (int i = 0; i < len; i++) {
				if (ct.isMarked(7) && ct.isMarked(4) && ct.isMarked(1)) {// ■■■
					ct.mark();
				} else if (ct.isMarked(7) && ct.isMarked(4) && !ct.isMarked(1)) {// ■■□
					ct.mark();
				} else if (ct.isMarked(7) && !ct.isMarked(4) && ct.isMarked(1)) {// ■□■
					ct.mark();
				} else if (ct.isMarked(7) && !ct.isMarked(4) && !ct.isMarked(1)) {// ■□□
					ct.mark();
				} else if (!ct.isMarked(7) && ct.isMarked(4) && ct.isMarked(1)) {// □■■
					ct.mark();
				} else if (!ct.isMarked(7) && ct.isMarked(4) && !ct.isMarked(1)) {// □■□
				} else if (!ct.isMarked(7) && !ct.isMarked(4) && ct.isMarked(1)) {// □□■
					ct.mark();
				} else if (!ct.isMarked(7) && !ct.isMarked(4)
						&& !ct.isMarked(1)) {// □□□
				}
				ct.fd(1);
			}
			ct.bk(len);
			ct.right(1);
		}
	}
}
