/*
 * 四角を二つ描くプログラム（大きさを引数としたもの）
 * 作成者：Yoshiaki Matsuzawa
 * 作成日：2011/12/06
 */
public class DrawTwoRectangles2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTwoRectangles2());
	}

	// タートルを動かす処理
	public void start() {
		drawRectangle(100);
		drawRectangle(20);
	}

	// 一辺がsizeの四角形を書く
	void drawRectangle(int size) {
		for (int i = 0; i < 4; i++) {
			fd(size);
			rt(90);
		}
	}

}