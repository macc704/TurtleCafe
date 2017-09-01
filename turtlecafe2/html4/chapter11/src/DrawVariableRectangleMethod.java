/*
 * 四角形を描くプログラム
 * （引数ありメソッドの練習）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */
public class DrawVariableRectangleMethod extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DrawVariableRectangleMethod());
	}

	// タートルを動かす処理
	public void start() {
		// 一辺の長さの入力を受け取る
		int inputLength = 0;
		print("一辺の長さを入力してください");
		inputLength = input();

		drawRectangle(inputLength);// 入力された長さを一辺の長さとして四角形を描く
	}

	// 四角形を描く
	void drawRectangle(int length) {
		for (int i = 0; i < 4; i++) {
			fd(length);
			rt(90);
		}
	}
}