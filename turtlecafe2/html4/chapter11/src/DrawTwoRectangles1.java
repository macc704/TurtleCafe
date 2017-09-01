/*
 * 四角を二つ描くプログラム（引数がないメソッドを使ったもの）
 * 作成者：Yoshiaki Matsuzawa
 * 作成日：2011/12/06
 */
public class DrawTwoRectangles1 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawTwoRectangles1());
	}

	// タートルを動かす処理
	public void start() {
		drawBigRectangle();
		drawSmallRectangle();
	}

	// 一辺100の大きな四角形を書く
	void drawBigRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(100);
			rt(90);
		}
	}

	// 一辺20の小さな四角形を書く
	void drawSmallRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(20);
			rt(90);
		}
	}
}