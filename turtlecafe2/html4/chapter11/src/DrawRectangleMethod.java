/*
 * 例題１：四角形を描くプログラム
 * （メソッドの作り方の練習）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */
public class DrawRectangleMethod extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawRectangleMethod());
	}

	// タートルを動かす処理
	public void start() {
		drawRectangle();
	}

	// 四角形を描く
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(50);
			rt(90);
		}
	}
}