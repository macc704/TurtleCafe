/*
 * キーに対応して車が動くプログラム
 * 
 * 2003/06/23 Yoshiaki Matsuzawa
 * 2012/11/07 改訂 Yoshiaki Matsuzawa 
 */
public class HandleKey extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new HandleKey());
	}

	// タートルを動かす処理
	public void start() {

		hide();// タートルを消す
		ImageTurtle car = new ImageTurtle("car.gif");// 車を生成

		{// アニメーションループ
			while (true) {
				// --- 待つ ---
				sleep(0.025);

				{// 一コマの処理をする
					// 左キーが押されていたら，車を動かす
					int x = car.getX();
					int y = car.getY();
					if (key() == 37) { // 左
						car.warp(x - 5, y);
					}
				}

				// --- 再描画 ---
				update();
			}
		}
	}

}