/*
 * CellTest.java
 * Created on 2011/12/16
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/**
 * @author macchan
 */
public class CellTest extends Turtle {

	public static void main(String[] args) {
		Turtle.startTurtle(new CellTest());
	}

	void start() {
		window.setSize(800, 600);
		hide();

		int len = 10;

		CellTurtle taro = new CellTurtle(10);
		taro.fd(len / 2);
		taro.mark();
		taro.fd(len / 2);
		taro.bk(len);
		taro.right();

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < len; i++) {
				// printT(taro);
				if (taro.isMarked(1) && !taro.isMarked(4) && !taro.isMarked(7)) {
					taro.mark();
				}
				taro.fd(1);
			}
			taro.bk(len);
			taro.right();
		}
	}

	/**
	 * @param taro
	 */
	@SuppressWarnings("unused")
	private void printT(CellTurtle taro) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + ":" + taro.getMarkingCheckPoint(i) + ", ");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + ":" + taro.isMarked(i) + ", ");
		}
		System.out.println();
	}
}
