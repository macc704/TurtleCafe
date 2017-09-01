/**
 * マウスのドラッグした位置に車が動くプログラム
 * 
 * Yoshiaki Matsuzawa 2011/11/22
 */
public class Kadai02 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Kadai02());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す

		// 車を生成
		ImageTurtle car = new ImageTurtle("car.gif");

		while (true) {

			// --- 待つ ---
			sleep(0.025);

			// --- 処理 ---

			// もし，左マウスボタンが押されていたら
			if (leftMouseDown() && car.contains(mouseX(), mouseY())) {
				car.warp(mouseX(), mouseY());// 車をマウスの位置に移動
			}

			// --- 再描画 ---
			update();
		}

	}

}