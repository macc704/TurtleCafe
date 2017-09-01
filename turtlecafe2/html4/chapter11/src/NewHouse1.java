/*
 * 家を描くプログラム（四角形と三角形を書くもの）
 * 作成者：Yoshiaki Matsuzawa
 * 作成日：2011/12/06
 */
public class NewHouse1 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new NewHouse1());
	}

	// タートルを動かす処理
	public void start() {
		drawTriangle(100);
		rt(90);
		drawRectangle(100);
	}

	// 三角形を書く
	void drawTriangle(int size) {
		rt(30);
		for (int i = 0; i < 3; i++) {
			fd(size);
			rt(120);
		}
		lt(30);
	}

	// 四角形を書く
	void drawRectangle(int size) {
		for (int i = 0; i < 4; i++) {
			fd(size);
			rt(90);
		}
	}

}