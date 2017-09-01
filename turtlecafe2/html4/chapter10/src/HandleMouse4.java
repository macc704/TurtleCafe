/*
 * マウスの押した位置に車が動くプログラム (右クリック，左クリック判定版)
 * 
 * 2003/06/23 Yoshiaki Matsuzawa 
 * 2012/11/07 改訂 Yoshiaki Matsuzawa
 */
public class HandleMouse4 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse4());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif");// 車を生成

		{// アニメーションループ
			while (true) {

				// --- 待つ ---
				sleep(0.1);

				{// 一コマの処理をする
					{// 左マウスボタンがクリックされた時の処理
						if (leftMouseClicked()) {
							car.warp(mouseX(), mouseY());// 車をマウスの位置に移動
						}
					}
					{ // 右マウスボタンがダブルクリックされた時の処理
						if (rightMouseClicked() && doubleClick()) {
							car.show(!car.isShow());// 車を(現す/隠す)
						}
					}
				}

				// --- 再描画 ---
				update();
			}
		}

	}

}