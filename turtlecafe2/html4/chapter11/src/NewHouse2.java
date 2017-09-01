/*
 * 家を描くプログラム（四角形と三角形を書くもの）
 * 作成者：Yoshiaki Matsuzawa
 * 作成日：2011/12/06
 */
public class NewHouse2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new NewHouse2());
	}

	// タートルを動かす処理
	public void start() {
		drawRegularPolygon(3, 100);
		rt(90);
		drawRegularPolygon(4, 100);
	}

	// 指定された角数の正多角形を描く
	void drawRegularPolygon(int n, int size) {
		// 向きを調節する
		double angle = 360d / (double) n;
		rt(angle - 90);

		// 多角形を描く
		for (int i = 0; i < n; i++) {
			fd(size);
			rt(angle);
		}

		// 向きを上向きに戻す
		lt(angle - 90);
	}

}