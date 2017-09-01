/*
 * 例題２：四角形を３つ描くプログラム
 * （メソッド処理の順序）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */

public class DrawThreeRectanglesMethod extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawThreeRectanglesMethod());
	}

	// タートルを動かす処理
	public void start() {
		// 四角形を３つ描く
		for (int i = 0; i < 3; i++) {
			drawRectangle();// 四角形を描く
			move();// 次の描く位置まで移動する
		}
	}

	// 四角形を描く
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(50);
			rt(90);
		}
	}

	// 次の描く位置まで移動する
	void move() {
		up();
		rt(90);
		fd(60);
		lt(90);
		down();
	}
}