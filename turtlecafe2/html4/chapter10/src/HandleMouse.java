/*
 * マウスの位置に車が動くプログラム
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa 
 */
public class HandleMouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleMouse());
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
					// 車をマウスの位置に移動する
					int mx = mouseX();// マウスのx座標を取得する
					int my = mouseY();// マウスのy座標を取得する
					car.warp(mx, my);
				}

				// --- 再描画 ---
				update();
			}
		}

	}

}