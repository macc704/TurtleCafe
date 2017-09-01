/*
 * Concurrent.java
 * Created on 2011/11/15
 * Copyright(c) 2011 Yoshiaki Matsuzawa, Shizuoka University. All rights reserved.
 */

/**
 * @author macchan
 */
public class Concurrent extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Concurrent());
	}

	// タートルを動かす処理
	public void start() {
		hide();
		int len = 50;

		Turtle taro = new Turtle();
		Turtle jiro = new Turtle();

		jiro.up();
		jiro.bk(100);
		jiro.down();

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < len; i++) {
				taro.fd(1);
				jiro.fd(1);
			}

			for (int i = 0; i < 8; i++) {
				taro.rt(9);
				jiro.rt(18);
			}
		}

	}
}
