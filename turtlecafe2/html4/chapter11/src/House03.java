/*
 * 窓付きの家を描くプログラム（２レベルをメソッド化）
 * 作成者：MegumiAraki
 * 作成日：2007/06/09
 * メールアドレス：garnet@sfc.keio.ac.jp
 */

public class House03 extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new House03());
	}

	// 家を描く
	//タートルを動かす処理
	public void start() {
		drawRoof(); // 屋根を描く
		drawWall(); // 壁を描く
		drawWindow(); // 窓を描く
	}

	// 屋根を描く
	void drawRoof() {
		drawTriangle(); // 三角形を描く
	}

	// 壁を描く
	void drawWall() {
		rt(90); // 向きを調節する
		drawRectangle();// 四角形を描く
		lt(90);// 向きを上向きに戻す
	}

	// 窓を描く
	void drawWindow() {
		// 窓を描く位置まで移動する
		moveToWindowLocation();

		// 窓を描く
		rt(90);
		for (int i = 0; i < 4; i++) {
			drawSmallRectangle();
			fd(16 * 2 + 4);
			rt(90);
		}
		lt(90);
	}

	// 三角形を描く
	void drawTriangle() {
		// 向きを調節する
		rt(30);

		// 三角形を描く
		for (int i = 0; i < 3; i++) {
			fd(80);
			rt(120);
		}

		// 向きを上向きに戻す
		lt(30);
	}

	// 四角形を描く
	void drawRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(80);
			rt(90);
		}
	}

	// 小さい四角形を描く
	void drawSmallRectangle() {
		for (int i = 0; i < 4; i++) {
			fd(16);
			rt(90);
		}
	}

	// 窓を描く位置まで移動する
	void moveToWindowLocation() {
		// 前処理
		up();

		// 右へ22
		rt(90);
		fd(22);

		// 下へ22
		rt(90);
		fd(22);

		// 後処理
		rt(180);
		down();
	}

}