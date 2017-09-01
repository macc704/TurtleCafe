/*
 * マウスのドラッグした位置に車が動くプログラム
 * 
 * 2011/11/22 Yoshiaki Matsuzawa 
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class HandleMouseDown extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouseDown());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif");// 車を生成

		{// アニメーションループ
			while (true) {
				// --- 待つ ---
				sleep(0.1);

				{ // 一コマの処理をする
					// 左マウスボタンが押されている時の処理
					if (leftMouseDown()) {
						car.warp(mouseX(), mouseY());// 車をマウスの位置に移動
					}
				}

				// --- 再描画 ---
				update();
			}
		}

	}

}